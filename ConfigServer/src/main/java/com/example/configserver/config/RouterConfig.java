package com.example.configserver.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("book-service", r -> r.path("/info")
                        .filters(f -> f.filter(new CustomFilter()))
                        .uri("http://localhost:8836"))
                .build();
    }
}
