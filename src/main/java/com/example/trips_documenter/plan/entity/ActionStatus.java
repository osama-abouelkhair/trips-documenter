package com.example.trips_documenter.plan.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        discriminatorType = DiscriminatorType.STRING,
        name = "status",
        columnDefinition = "VARCHAR(10)"
)
@Getter
public class ActionStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    ActionStatus completed() {
        return new CompletedAction();
    }

    ActionStatus abandoned() {
        return new AbandonedAction();
    }
}
