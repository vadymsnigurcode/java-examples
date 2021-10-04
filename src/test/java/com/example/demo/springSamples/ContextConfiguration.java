package com.example.demo.springSamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public OrderService orderService() {
        OrderService orderService = new OrderServiceImpl();
        return orderService;
    }
}
