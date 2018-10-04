package com.jd.webstore.repositories.impl;

import com.jd.webstore.domains.Customer;
import com.jd.webstore.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
}
