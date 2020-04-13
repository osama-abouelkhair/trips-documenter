package com.example.trips_documenter.plan.entity;

import javax.persistence.Embeddable;

@Embeddable
public class AbandonedAction implements ActionStatus {

    private String status = "abandoned";

    @Override
    public ActionStatus next() {
        return null;
    }
}
