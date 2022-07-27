package com.mbsystems.testcontainersdemo.service;

import com.mbsystems.testcontainersdemo.entity.Customer;
import com.mbsystems.testcontainersdemo.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class CustomerServiceTest {

    @Autowired
    private CustomerRepository customerRepository;

    private PostgreSQLContainer<> container = new PostgreSQLContainer<>()
//    @BeforeEach
//    void setUp() {
//    }

    @Test
    void when_using_a_clean_db_this_should_be_empty() {
        List<Customer> customers = this.customerRepository.findAll();
        assertThat(customers).hasSize(2);
    }
}