package com.practice.webapp.learnarango.entity;

import com.arangodb.springframework.annotation.Document;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Document("orders")
@Data
public class Order {
    @Id
    private String id;
    private String product;
    private int quantity;

    // Getters and setters
}

