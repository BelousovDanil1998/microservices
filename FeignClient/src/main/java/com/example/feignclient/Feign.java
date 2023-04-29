package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "config-client")
public interface Feign {
    @GetMapping("/info")
    String getAllBooks();
}

