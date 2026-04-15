package com.chandramouli.foodsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.chandramouli.foodsystem")
public class FoodsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodsystemApplication.class, args);
    }
}