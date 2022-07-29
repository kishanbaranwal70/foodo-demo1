package com.foodbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
public class FoodBackEndApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoodBackEndApplication.class);
    }
}
