package com.example.trips_documenter.plan.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Embedded
    ActionStatus status = new NewAction();

    private String name;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    @ManyToMany
    @JoinTable(
            name = "dependents_actions",
            joinColumns = @JoinColumn(name = "dependent_action_id"),
            inverseJoinColumns = @JoinColumn(name = "dependable_action_id"))
    private Set<Action> dependents;

    @ManyToMany
    @JoinTable(
            name = "consequences_actions",
            joinColumns = @JoinColumn(name = "consequence_action_id"),
            inverseJoinColumns = @JoinColumn(name = "previous_action_id"))
    private Set<Action> consequences;

    public Action dependsOnAction(Action action) {
        dependents.add(action);
        return this;
    }

    public Action registerConsequenceAction(Action action) {
        consequences.add(action);
        return this;
    }
}
