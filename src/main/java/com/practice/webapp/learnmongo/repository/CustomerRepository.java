package com.practice.webapp.learnmongo.repository;

import com.practice.webapp.learnmongo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
