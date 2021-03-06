package com.example.trips_documenter.user.services;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Data
public class UserDTO {
    public UserDTO() {}
    public UserDTO(@NotNull String name, @NotNull LocalDate birthdate, @NotNull String email) {
        this.name = name;
        this.birthdate = birthdate;
        this.email = email;
    }

    public Long id;

    @NotNull
    public String name;

    @NotNull
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public LocalDate birthdate;

    @NotNull
    public String email;

    public AddressDTO address;

}
