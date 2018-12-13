package com.neotechlabs.repository;

import com.neotechlabs.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
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
