package com.example.trips_documenter.currencyconversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Currency;

public class CurrencyRateRetrieval {



    private static String baseUrl = "https://api.exchangeratesapi.io/latest";

    public static Float getConversionRate(Currency baseCurrency, Currency toCurrency) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity(baseUrl + "?base=" +
                baseCurrency.getCurrencyCode() + "&symbols=" + toCurrency.getCurrencyCode(), String.class);
        String jsonString = response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = null;
        try {
            actualObj = mapper.readTree(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // When
        JsonNode rates = actualObj.get("rates");
        String currencyConverionsRate = rates.get(toCurrency.getCurrencyCode()).textValue();
    }


}
