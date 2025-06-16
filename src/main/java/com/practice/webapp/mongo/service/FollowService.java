package com.practice.webapp.mongo.service;

import com.practice.webapp.mongo.entity.Follow;
import com.practice.webapp.mongo.repository.FollowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FollowService {

    private final FollowRepository repo;

    public List<Follow> findAll() {
        return repo.findAll();
    }

    public Follow findById(String id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Follow not found with id: " + id));
    }

    public Follow save(Follow follow) {
        try {
            return repo.save(follow);
        } catch (Exception e) {
            System.out.println("Error saving follow: " + e.getMessage());
            throw e;
        }
    }

    public Follow update(String id, String newProfileId) {


        try {
            Follow follow = repo.findById(id).orElseThrow(() -> new RuntimeException("Follow not found with id: " + id));
            follow.setProfileId(newProfileId);
            return repo.save(follow);
        } catch (Exception e) {
            System.out.println("Error saving follow: " + e.getMessage());
            throw e;
        }
    }
}
