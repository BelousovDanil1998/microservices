package com.example.feignclient;

import model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(name = "book-service")
public interface Feign {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}

