package com.example.cleanarchitecture.customer.repository;

import com.example.cleanarchitecture.customer.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
