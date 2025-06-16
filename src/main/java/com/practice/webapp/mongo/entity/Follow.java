package com.practice.webapp.mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Data
@Document(collection = "follow")
public class Follow {

    @Id
    private String id;

    private String userId;
    private String profileId;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private ZonedDateTime updatedAt;
}
