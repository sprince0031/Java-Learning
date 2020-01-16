package com.sprince0031.car;

import org.junit.Test;

public class CarServiceTest {
    
    @Test
    public void shouldDemonstrateLogging() {
        CarService carService = new CarService();
        carService.process("Tesla");
    }

    @Test
    public void shouldRunDriveMethod() {
        Car[] cars = {new Tesla(), new Porshe()};
        CarService carService = new CarService();
        carService.drive(cars);
    }

    @Test
    public void shouldLogCarMessage() {
        Loggable[] cars = {new Tesla(), new Porshe()};
        CarService carService = new CarService();
        carService.carMessage(cars);
    }
}