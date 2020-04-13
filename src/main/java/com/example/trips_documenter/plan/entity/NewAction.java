package com.example.trips_documenter.plan.entity;

import javax.persistence.Embeddable;

@Embeddable
public class NewAction implements ActionStatus {

    private String status = "new";

    @Override
    public ActionStatus next() {
        return null;
    }
}
