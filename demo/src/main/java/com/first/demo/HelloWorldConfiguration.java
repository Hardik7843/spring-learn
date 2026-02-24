package com.first.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) {
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
    @Primary
    Person person() {
        return new Person("Hardik", 23, address());
    }


    @Bean(name = "personAddress")
    @Primary
    Address address() {
        return new Address("Malad", "East", 400097);
    }

    @Bean(name = "personAddress2")
    @Qualifier("address2Qual")
    Address address2() {
        return new Address("Kandiwali", "East", 400097);
    }

    @Bean
    Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    Person person3Parameter(String name, int age, @Qualifier("address2Qual") Address personAddress) {
        return new Person(name, age, personAddress);
    }
}
