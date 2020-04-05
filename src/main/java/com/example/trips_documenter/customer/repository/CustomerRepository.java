package com.example.trips_documenter.customer.repository;

import com.example.trips_documenter.customer.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
