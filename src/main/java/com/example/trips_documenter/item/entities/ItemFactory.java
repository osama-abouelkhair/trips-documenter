package com.example.trips_documenter.item.entities;

import com.example.trips_documenter.item.services.CurrencyRateRetrieval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Currency;

@Component
public class ItemFactory {

    @Autowired
    CurrencyRateRetrieval currencyRateRetrieval;

    public Item create(Long trip, String name, Float price, Currency currency, Currency userCurrency, String description) {
        Float conversionRate = currencyRateRetrieval.getConversionRate(currency, userCurrency);
        Cost cost = new Cost(price, currency.getCurrencyCode(), conversionRate);
        Item item = new Item(trip, name, cost, description);
        return item;
    }
}
