package com.jd.webstore.services.Impl;

import com.jd.webstore.domains.Customer;
import com.jd.webstore.repositories.CustomerRepository;
import com.jd.webstore.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
}
