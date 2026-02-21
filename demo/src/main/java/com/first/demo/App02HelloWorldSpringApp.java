package com.first.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpringApp {
    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
    }
}
