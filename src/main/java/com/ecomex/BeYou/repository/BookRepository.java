package com.ecomex.BeYou.repository;

import com.ecomex.BeYou.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
