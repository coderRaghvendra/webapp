package com.practice.webapp.learnmongo.repository;

import com.practice.webapp.learnmongo.entity.Follow;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FollowRepository extends MongoRepository<Follow, String> {
}
