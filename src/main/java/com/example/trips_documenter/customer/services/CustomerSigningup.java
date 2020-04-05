package com.example.trips_documenter.customer.services;

import com.example.trips_documenter.customer.entities.Address;
import com.example.trips_documenter.customer.entities.Customer;
import com.example.trips_documenter.customer.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerSigningup {

    @Autowired
    CustomerRepository customerRepository;

    ModelMapper modelMapper = new ModelMapper();

    public CustomerDTO signUp(CustomerDTO customerDTO) {
        return convertToDto(customerRepository.save(convertToEntity(customerDTO)));
    }

    private CustomerDTO convertToDto(Customer customer) {
        CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
        return customerDTO;
    }

    private Customer convertToEntity(CustomerDTO customerDto)  {
        Address address = null;
        if (customerDto.address != null) {
            address = Address.createAddress(
                    customerDto.address.line,
                    customerDto.address.PostalCode,
                    customerDto.address.city);
        }
        Customer customer = Customer.createCustomer(
                customerDto.id,
                customerDto.name,
                customerDto.birthdate,
                customerDto.email,
                address);
        return customer;
    }

}
