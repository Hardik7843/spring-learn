package com.first.demo.BusinessCalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbServices implements DataService {

    public int[] retrievedData() {
        System.out.println("Running MongoDB Service..");
        return new int[]{1, 2, 3, 4, 5, 6};
    }
}
