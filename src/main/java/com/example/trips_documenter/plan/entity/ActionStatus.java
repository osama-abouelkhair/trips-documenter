package com.example.trips_documenter.plan.entity;

public interface ActionStatus {

    ActionStatus next();

    default ActionStatus completed() {
        return new CompletedAction();
    }

    default ActionStatus abandoned() {
        return new AbandonedAction();
    }
}
