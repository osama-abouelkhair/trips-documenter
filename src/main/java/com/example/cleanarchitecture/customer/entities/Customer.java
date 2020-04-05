package com.example.cleanarchitecture.customer.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthdate;

    @Embedded
    private Address address;

    @Email
    private String email;

    public Customer() {}

    public static Customer createCustomer(Long id, String name, LocalDate birthDate, String email, Address address) {
        Customer customer = new Customer();
        customer.id = id;
        customer.name = name;
        customer.birthdate = birthDate;
        customer.address = address;
        customer.email = email;
        customer.address = address;
        return customer;
    }

    Customer changeAddress(Address address) {
        this.address = address;
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
