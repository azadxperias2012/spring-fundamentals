package com.neotechlabs.service;

import com.neotechlabs.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
