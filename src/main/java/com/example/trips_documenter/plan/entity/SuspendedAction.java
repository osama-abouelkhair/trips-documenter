package com.example.trips_documenter.plan.entity;

import javax.persistence.Embeddable;

@Embeddable
public class SuspendedAction implements ActionStatus {

    private String status = "suspended";

    @Override
    public ActionStatus next() {
        return null;
    }
}
