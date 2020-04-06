package com.example.trips_documenter.user.repository;

import com.example.trips_documenter.user.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
