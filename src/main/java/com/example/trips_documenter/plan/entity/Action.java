package com.example.trips_documenter.plan.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "status")
    ActionStatus status;

    private String name;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    public Action() { }

    public Action(ActionStatus status, String name, LocalDateTime startTime, LocalDateTime endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    @ManyToMany
    @JoinTable(
            name = "dependents_actions",
            joinColumns = @JoinColumn(name = "dependent_action_id"),
            inverseJoinColumns = @JoinColumn(name = "dependable_action_id"))
    private Set<Action> dependents = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "consequences_actions",
            joinColumns = @JoinColumn(name = "consequence_action_id"),
            inverseJoinColumns = @JoinColumn(name = "previous_action_id"))
    private Set<Action> consequences = new HashSet<>();

    public Action addActionAsdependant(Action action) {
        dependents.add(action);
        return this;
    }

    public Action addActionsAsConsequence(Action action) {
        consequences.add(action);
        return this;
    }
}
