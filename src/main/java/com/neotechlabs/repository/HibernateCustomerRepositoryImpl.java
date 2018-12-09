package com.neotechlabs.repository;

import com.neotechlabs.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Azad Asanali");
        customer.setLastName("Abbas Ali");

        customers.add(customer);

        return customers;
    }

}
