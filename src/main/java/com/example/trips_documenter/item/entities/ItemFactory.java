package com.example.trips_documenter.item.entities;

import com.example.trips_documenter.item.services.CurrencyRateRetrieval;

import java.util.Currency;

public class ItemFactory {

    public Item create(Long trip, String name, Float price, Currency currency, Currency userCurrency, String description) {
        Float conversionRate = CurrencyRateRetrieval.getConversionRate(currency, userCurrency);
        Cost cost = new Cost(price, currency.getCurrencyCode(), conversionRate);
        Item item = new Item(trip, name, cost, description);
        return item;
    }
}
