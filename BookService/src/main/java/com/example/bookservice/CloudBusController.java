package com.example.bookservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class CloudBusController {

    @Value("${hello.message}")
    private String helloMessage;

    @GetMapping("/hello")
    public String getHelloMessage() {
        return helloMessage;
    }
}
