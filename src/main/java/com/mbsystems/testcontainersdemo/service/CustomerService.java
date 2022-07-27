package com.mbsystems.testcontainersdemo.service;

import com.mbsystems.testcontainersdemo.entity.Customer;
import com.mbsystems.testcontainersdemo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }
}
