package com.first.demo.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {
    Depedenncy1 depedenncy1;


    Dependency2 dependency2;

    //    @Autowired // Auto wiring is optional in Constructor Injection
    public YourBusinessClass(Depedenncy1 depedenncy1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection - Your BUsiness Class");
        this.depedenncy1 = depedenncy1;
        this.dependency2 = dependency2;
    }

//    @Autowired
//    public void setDependency1(Depedenncy1 depedenncy1) {
//        System.out.println("Getter/Setter Injection - Dependency1");
//        this.depedenncy1 = depedenncy1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Getter/Setter Injection - Dependency2");
//        this.dependency2 = dependency2;
//    }

    public String toString() {
        return "Using " + depedenncy1 + " and " + dependency2;
    }
}

@Component
class Depedenncy1 {
}

@Component
class Dependency2 {

}


@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

    static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
            var stream = Arrays.stream(context.getBeanDefinitionNames());

            stream.forEach(name -> System.out.println(name));
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
