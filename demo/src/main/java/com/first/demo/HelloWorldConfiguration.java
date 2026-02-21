package com.first.demo;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.temporal.ValueRange;

record Person(String name, int age) {
}

record Address(String firstLine, String secondLine, int pinCode) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    String name() {
        return "Hardik";
    }

    @Bean
    int age() {
        return 23;
    }

    @Bean
    Person person() {
        return new Person("Hardik", 23);
    }

    @Bean
    Address address() {
        return new Address("Malad", "East", 400097);
    }
}
