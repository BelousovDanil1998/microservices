package com.example.feignclient;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final Feign feign;

    public BookService(Feign feign) {
        this.feign = feign;
    }


    public List<Book> getAllBooks() {
        return feign.getAllBooks();
    }

}
