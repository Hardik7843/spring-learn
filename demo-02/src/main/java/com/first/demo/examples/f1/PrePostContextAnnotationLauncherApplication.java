package com.first.demo.examples.f1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;

        System.out.println("All Dependencies are ready!");
    }

    @PostConstruct
    public void initialise() {
        someDependency.getReady();
    }

    
}

@Component 
class SomeDependency {

    void getReady() {
        System.out.println("Some Logic Using someDepency!");
    }

}

@Configuration
@ComponentScan
public class PrePostContextAnnotationLauncherApplication {

    static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(PrePostContextAnnotationLauncherApplication.class)) {
            // var stream = Arrays.stream(context.getBeanDefinitionNames());

            // stream.forEach(name -> System.out.println(name));
            System.out.println(context.getBean(SomeClass.class));
        }
    }
}
