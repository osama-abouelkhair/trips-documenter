package com.example.trips_documenter.plan.entity;

import javax.persistence.Embeddable;

@Embeddable
public class CompletedAction implements ActionStatus {

    private String status = "completed";

    @Override
    public ActionStatus next() {
        return null;
    }
}
