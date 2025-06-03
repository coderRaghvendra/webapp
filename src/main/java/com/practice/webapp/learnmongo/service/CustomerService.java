package com.practice.webapp.learnmongo.service;

import com.practice.webapp.learnmongo.entity.Customer;
import com.practice.webapp.learnmongo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public List<Customer> findAll() {
        return repo.findAll();
    }

    public Customer save(Customer customer) {
        return repo.save(customer);
    }
}
