package com.sprince0031.car;

// import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
    
    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input) {
        // if (log.isDebugEnabled()) { - Condition necessary if you are concatenating with '+'
        //     log.debug("processing car: " + input); 
        // }
        log.debug("processing car: {}", input); // Here the check is done internally itself.
    }

    public void drive(Car[] cars) {
        for (Car car: cars) {
            car.drive();
        }
    }

    public void carMessage(Loggable[] cars) {
        for (Loggable car: cars) {
            System.out.println(car.message());
        }
    } 

}