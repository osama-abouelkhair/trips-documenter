package com.example.trips_documenter.plan.entity;

import javax.persistence.Embeddable;

@Embeddable
public class StartedAction implements ActionStatus {

    private String status = "started";

    @Override
    public ActionStatus next() {
        return null;
    }
}
