package com.example.configclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class ConfigClientController {

    @GetMapping
    public String getAllBooks() {
        return "feign information";
    }


}
