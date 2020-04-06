package com.example.trips_documenter.user.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthdate;

    @Embedded
    private Address address;

    @Email
    private String email;

    public User() {}

    public static User createUser(Long id, String name, LocalDate birthDate, String email, Address address) {
        User user = new User();
        user.id = id;
        user.name = name;
        user.birthdate = birthDate;
        user.address = address;
        user.email = email;
        user.address = address;
        return user;
    }

    User changeAddress(Address address) {
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
