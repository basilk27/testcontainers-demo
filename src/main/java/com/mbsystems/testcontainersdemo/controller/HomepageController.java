package com.mbsystems.testcontainersdemo.controller;

import com.mbsystems.testcontainersdemo.entity.Customer;
import com.mbsystems.testcontainersdemo.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class HomepageController {

    private final CustomerService customerService;

    public HomepageController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    public List<Customer> customers() {
        List<Customer> customers = this.customerService.findAll();
        customers.forEach(c -> log.info("Found a customer: {}", c));
        return customers;
    }
}
