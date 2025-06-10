package com.practice.webapp.learnmongo.controller;

import com.practice.webapp.learnmongo.entity.Customer;
import com.practice.webapp.learnmongo.entity.Follow;
import com.practice.webapp.learnmongo.service.CustomerService;
import com.practice.webapp.learnmongo.service.FollowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @PostMapping
    public Follow create(@RequestBody Follow follow) {
        System.out.println("Follow : " + follow);
        return service.save(follow);
    }
}

