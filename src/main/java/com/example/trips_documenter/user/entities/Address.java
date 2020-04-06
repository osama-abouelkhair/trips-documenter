package com.example.trips_documenter.user.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String line;

    private String postalCode;

    private String city;

    public Address(){}

    public static Address createAddress(String addressLine, String postalCode, String city) {
        Address address = new Address();
        address.line = addressLine;
        address.postalCode = postalCode;
        address.city = city;
        return address;
    }

}
