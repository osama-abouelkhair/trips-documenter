package com.example.trips_documenter.plan.entity;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Entity
@DiscriminatorValue("completed")
public class CompletedAction extends ActionStatus {

    public ActionStatus next() {
        return null;
    }
}
