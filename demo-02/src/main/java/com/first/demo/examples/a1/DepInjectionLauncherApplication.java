package com.first.demo.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.naming.Name;
import java.util.Arrays;

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

    static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
            var stream = Arrays.stream(context.getBeanDefinitionNames());

            stream.forEach(name -> System.out.println(name));
        }
    }
}
