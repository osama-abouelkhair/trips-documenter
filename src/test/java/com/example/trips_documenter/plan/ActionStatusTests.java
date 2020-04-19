package com.example.trips_documenter.plan;


import com.example.trips_documenter.plan.entity.*;
import com.example.trips_documenter.plan.repository.ActionRepository;
import com.example.trips_documenter.plan.repository.ActionStatusRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.stream.StreamSupport;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ActionStatusTests {

    @Autowired
    ActionRepository actionRepository;

    @Autowired
    PlanFactory planFactory;

    @Autowired
    ActionStatusRepository actionStatusRepository;

    @Test
    void newActionsCreatedWithNewActionStatusTest() {
        ActionStatus newActionStatus = new NewAction();
        actionStatusRepository.save(newActionStatus);

        ActionStatus actionStatus = new CompletedAction();
        actionStatusRepository.save(actionStatus);

        Action action = planFactory.create("action - 1", LocalDateTime.now(), LocalDateTime.now());
        Action savedAction = actionRepository.save(action);

        assertThat(savedAction.getStatus()).isInstanceOf(NewAction.class);
    }

    @Test
    void consequenceAndDependantActionsTest() {
        ActionStatus newActionStatus = new NewAction();
        actionStatusRepository.save(newActionStatus);

        ActionStatus c = new CompletedAction();
        actionStatusRepository.save(c);

        Action action = planFactory.create("action - 1", LocalDateTime.now(), LocalDateTime.now());
        Action consequenceAction = planFactory.create("action - 2", LocalDateTime.now(), LocalDateTime.now());
        Action dependantAction = planFactory.create("action - 3", LocalDateTime.now(), LocalDateTime.now());
        actionRepository.save(action);
        actionRepository.save(consequenceAction);
        actionRepository.save(dependantAction);

        action.addActionsAsConsequence(consequenceAction);
        action.addActionAsdependant(dependantAction);
        Action savedAction = actionRepository.save(action);

        assertThat(StreamSupport.stream(actionRepository.findAll().spliterator(), false).count()).isEqualTo(3);
        assertThat(savedAction.getConsequences().contains(consequenceAction));
        assertThat(savedAction.getDependents().contains(dependantAction));
    }

}
