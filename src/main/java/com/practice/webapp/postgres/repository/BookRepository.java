package com.practice.webapp.postgres.repository;

import com.practice.webapp.postgres.enity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
