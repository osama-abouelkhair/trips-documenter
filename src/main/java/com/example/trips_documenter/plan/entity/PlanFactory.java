package com.example.trips_documenter.plan.entity;

import com.example.trips_documenter.plan.repository.NewActionStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PlanFactory {

    @Autowired
    NewActionStatusRepository newActionStatusRepository;

    public Action create(String name, LocalDateTime startTime, LocalDateTime endTime) {
        ActionStatus newStatus = newActionStatusRepository.findAll().iterator().next();
        return new Action(newStatus, name, startTime, endTime);
    }
}
