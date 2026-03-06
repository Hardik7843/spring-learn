package com.first.demo.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLContextLauncherApplication {


    static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            var stream = Arrays.stream(context.getBeanDefinitionNames());


            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
        }
    }
}
