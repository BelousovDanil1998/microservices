package com.example.feignclient;


import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class FeignController {
    @Autowired
    Feign feign;

    @GetMapping("/books")
    public List<Book> getAllBooksFromClient() {
        return feign.getAllBooks();
    }


}
