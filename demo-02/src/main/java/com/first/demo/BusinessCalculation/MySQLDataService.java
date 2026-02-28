package com.first.demo.BusinessCalculation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQLDataService")
public class MySQLDataService implements DataService {
    
    public int[] retrievedData() {
        return new int[]{11, 22, 33, 44, 55,};
    }
}
