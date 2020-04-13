package com.example.trips_documenter.plan.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "plan_id")
    private Set<Action> actions;

}
