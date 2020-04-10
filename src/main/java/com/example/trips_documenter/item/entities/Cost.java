package com.example.trips_documenter.item.entities;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Cost {

    private Cost() {
    }

    protected Cost(Float price, String currency, Float conversionRate) {
        this.price = price;
        this.currency = currency;
        this.conversionRate = conversionRate;
    }

    private Float price;

    private String currency;

    private Float conversionRate;
}
