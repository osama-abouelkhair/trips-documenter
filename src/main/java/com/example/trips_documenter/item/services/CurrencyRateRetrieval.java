package com.example.trips_documenter.item.services;

import java.util.Currency;

public interface CurrencyRateRetrieval {
    Float getConversionRate(Currency baseCurrency, Currency toCurrency);
}
