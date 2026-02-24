package com.first.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpringApp {
    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("personAddress"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean(Person.class));

        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameter"));
    }
}
