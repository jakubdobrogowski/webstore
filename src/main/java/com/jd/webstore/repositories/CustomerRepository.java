package com.jd.webstore.repositories;

import com.jd.webstore.domains.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> getAllCustomers();
}
