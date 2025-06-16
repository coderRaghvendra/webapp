package com.practice.webapp.mongo.repository;

import com.practice.webapp.mongo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
