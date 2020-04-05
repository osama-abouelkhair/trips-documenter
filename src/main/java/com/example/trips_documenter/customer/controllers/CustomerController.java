package com.example.trips_documenter.customer.controllers;

import com.example.trips_documenter.customer.services.CustomerDTO;
import com.example.trips_documenter.customer.services.CustomerSigningup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerSigningup customerSigningup;

    @PostMapping
    CustomerDTO signUp(@Validated @RequestBody CustomerDTO customerDTO) {
        return customerSigningup.signUp(customerDTO);
    }


}
