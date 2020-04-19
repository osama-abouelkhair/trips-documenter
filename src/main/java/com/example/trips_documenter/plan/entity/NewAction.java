package com.example.trips_documenter.plan.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@DiscriminatorValue("new")
public class NewAction extends ActionStatus {

    public ActionStatus next() {
        return null;
    }
}
