package com.example.trips_documenter.item.entities;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Currency;

@Entity
@Getter
public class Item {

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

    public static Item createItem(Long trip, String name, Float price, Currency currency, Currency userCurrency, String description) {
        Item item = new Item();
        item.trip = trip;
        item.name = name;
        item.description = description;
        item.cost = CostFactory.create(price, currency, userCurrency);
        return item;
    }
}
