package com.practice.webapp.learn1.repository;

import com.practice.webapp.learn1.enity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
