package com.example.trips_documenter.item.entities;

import lombok.Getter;

import javax.persistence.Embeddable;
import java.util.Currency;

@Embeddable
@Getter
public class Cost {

    private Cost() { }

    Cost(Float price, Currency currency, Float conversionRate) {
        this.price = price;
        this.currency = currency.getCurrencyCode();
        this.conversionRate = conversionRate;
    }

    private Float price;

    private String currency;

    private Float conversionRate;
}
