package com.example.trips_documenter.cost.entities;

import lombok.AllArgsConstructor;

import javax.persistence.Embeddable;
import java.util.Currency;

@Embeddable
@AllArgsConstructor
public class Cost {

    private Float price;

    private Currency currency;

    private Float conversionRate;

    public Cost convertTo(Currency currency) {
        Float newPrice = this.price * conversionRate;
        Cost cost = new Cost(newPrice, currency, 1 / conversionRate);
        return cost;
    }
}
