package com.first.demo.BusinessCalculation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class BusinessAppContext {
    static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BusinessAppContext.class)) {
            BusinessCalculationService businessCalculationService = context.getBean(BusinessCalculationService.class);
            businessCalculationService.findMax();
        }
    }
}
