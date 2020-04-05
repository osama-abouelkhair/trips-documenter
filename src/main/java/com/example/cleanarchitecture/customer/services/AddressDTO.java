package com.example.cleanarchitecture.customer.services;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class AddressDTO {

    @NotNull
    public String line;

    @NotNull
    public String PostalCode;

    @NotNull
    public String city;

}
