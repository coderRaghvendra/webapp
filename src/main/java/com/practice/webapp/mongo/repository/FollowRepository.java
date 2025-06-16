package com.practice.webapp.mongo.repository;

import com.practice.webapp.mongo.entity.Follow;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FollowRepository extends MongoRepository<Follow, String> {
}
