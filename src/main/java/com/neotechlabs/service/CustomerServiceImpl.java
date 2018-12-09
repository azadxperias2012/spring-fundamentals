package com.neotechlabs.service;

import com.neotechlabs.model.Customer;
import com.neotechlabs.repository.CustomerRepository;
import com.neotechlabs.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
