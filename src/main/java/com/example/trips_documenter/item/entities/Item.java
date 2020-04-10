package com.example.trips_documenter.item.entities;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
public class Item {
    protected Item(@NotNull Long trip, @NotNull String name, @NotNull Cost cost, String description) {
        this.trip = trip;
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    private Long trip;

    @NotNull
    private String name;

    @NotNull
    @Embedded
    private Cost cost;

    private String description;

}
