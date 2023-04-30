package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(name = "book-service")
public interface Feign {
    @GetMapping("/info")
    List<Book> getAllBooks();
}

