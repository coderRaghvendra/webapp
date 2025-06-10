package com.practice.webapp.learnmongo.service;

import com.practice.webapp.learnmongo.entity.Follow;
import com.practice.webapp.learnmongo.repository.FollowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
            follow.setCreatedAt(LocalDateTime.of(2024, 1, 5, 5, 30, 0)); // Set a specific date for testing
            Follow f = repo.save(follow);
            System.out.println("Follow saved: " + f.getUserId());
            System.out.println("Follow saved: " + f.getProfileId());
            return f;
        } catch (Exception e) {
            System.out.println("Error saving follow: " + e.getMessage());
            throw e;
        }
    }
}
