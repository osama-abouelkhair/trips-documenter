package com.example.trips_documenter.item.entities;

import com.example.trips_documenter.item.services.CurrencyRateRetrieval;

import java.util.Currency;

public class CostFactory {

    public static Cost create(Float price, Currency currency, Currency userCurrency) {
        Float conversionRate = CurrencyRateRetrieval.getConversionRate(currency, userCurrency);
        Cost cost = new Cost(price, currency, conversionRate);
        return cost;
    }


}
