package com.first.demo.BusinessCalculation;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ComponentScan
public class BusinessCalculationService {
    DataService dataService;

    BusinessCalculationService(@Qualifier("MySQLDataService") DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        var ans = Arrays.stream(dataService.retrievedData()).max().orElse(0);
        System.out.println("answer: " + ans);
        return ans;
    }
}
