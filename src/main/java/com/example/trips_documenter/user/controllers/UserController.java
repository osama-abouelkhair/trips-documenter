package com.example.trips_documenter.user.controllers;

import com.example.trips_documenter.user.services.UserDTO;
import com.example.trips_documenter.user.services.UserSigningup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserSigningup userSigningUp;

    @PostMapping
    UserDTO signUp(@Validated @RequestBody UserDTO userDTO) {
        return userSigningUp.signUp(userDTO);
    }


}
