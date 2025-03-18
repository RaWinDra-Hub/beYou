package com.ecomex.BeYou.service;

import com.ecomex.BeYou.entity.Book;
import com.ecomex.BeYou.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book>getAllBooks(){
        return bookRepository.findAll();

    }
    public Book getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }



}
