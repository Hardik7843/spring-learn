package com.first.demo.examples.g1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessService{
    private DataService dataService;

    
    @Autowired
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }
    public DataService getDataService() {
        System.out.println("Setter Injection Performed");
        return dataService;
    }

}

@Component
class DataService{

}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

    static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)) {
            // var stream = Arrays.stream(context.getBeanDefinitionNames());

            // stream.forEach(name -> System.out.println(name));

            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
