package com.practice.webapp.mongo.controller;

import com.practice.webapp.mongo.entity.Follow;
import com.practice.webapp.mongo.service.FollowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/follow")
public class FollowController {

    private final FollowService service;

    public FollowController(FollowService service) {
        this.service = service;
    }

    @GetMapping
    public List<Follow> getAll() {
        return service.findAll();
    }

    // write get Follow by id method
     @GetMapping("/{id}")
     public Follow getById(@PathVariable String id) {
         return service.findById(id);
     }

     /**
      * curl -X POST "http://localhost:8080/api/follow" \
      * -H "Content-Type: application/json" \
      * -d '{"profileId":"exampleProfileId","followerId":"exampleFollowerId"}'
      * */
    @PostMapping
    public Follow create(@RequestBody Follow follow) {
        System.out.println("Follow : " + follow);
        return service.save(follow);
    }

    /**
     * curl -X PUT "http://localhost:8080/api/follow/{id}" \
     * -H "Content-Type: application/x-www-form-urlencoded" \
     * -d "newProfileId=exampleProfileId"
     * */
    @PutMapping("/{id}")
    public Follow update(@PathVariable String id, @RequestParam String newProfileId) {
        return service.update(id, newProfileId);
    }
}

