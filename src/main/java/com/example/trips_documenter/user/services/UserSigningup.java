package com.example.trips_documenter.user.services;

import com.example.trips_documenter.user.entities.Address;
import com.example.trips_documenter.user.entities.User;
import com.example.trips_documenter.user.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSigningup {

    @Autowired
    UserRepository userRepository;

    ModelMapper modelMapper = new ModelMapper();

    public UserDTO signUp(UserDTO userDTO) {
        return convertToDto(userRepository.save(convertToEntity(userDTO)));
    }

    private UserDTO convertToDto(User user) {
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

    private User convertToEntity(UserDTO userDTO)  {
        Address address = null;
        if (userDTO.address != null) {
            address = Address.createAddress(
                    userDTO.address.line,
                    userDTO.address.PostalCode,
                    userDTO.address.city);
        }
        User user = User.createUser(
                userDTO.id,
                userDTO.name,
                userDTO.birthdate,
                userDTO.email,
                address);
        return user;
    }

}
