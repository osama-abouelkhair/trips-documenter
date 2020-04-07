package com.example.trips_documenter.cost.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Currency;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    private Long tripId;

    @NotNull
    private String name;

    @NotNull
    private Cost cost;

    private String description;

    public static Item createItem(Long tripId, String name, Float price, Currency currency, String description) {
        Item item = new Item();
        item.tripId = tripId;
        item.name = name;
        item.description = description;
        return item;
    }
}
