package com.example.feignclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class FeignController {
    @Autowired
    Feign feign;

    @GetMapping
    public String getAllBooks() {
        return "feign + " + feign.getAllBooks();
    }

}
