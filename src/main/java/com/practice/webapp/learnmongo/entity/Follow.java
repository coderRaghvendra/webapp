package com.practice.webapp.learnmongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Data
@Document(collection = "follow")
public class Follow {

    @Id
    private String id;

    private String userId;
    private String profileId;
    private LocalDateTime createdAt = LocalDateTime.now(ZoneId.of("UTC"));
    private ZonedDateTime updatedAt = ZonedDateTime.now();
}
