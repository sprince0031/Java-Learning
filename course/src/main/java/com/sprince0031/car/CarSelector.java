package com.sprince0031.car;

public class CarSelector {

    public enum CarState {
        QUEUED, SERVICING, SERVICED;
    }

    private static boolean isValid(String value) {
        try {
            CarState.valueOf(value);
        } catch (IllegalStateException e) {
            return false;
        }
        return true;
    }
    public static void main(String[] arguments) throws Exception {
        CarService carService = new CarService();
        for (String car: arguments) {
            if (isValid(car)) {
                System.out.println("Processing " + car);
            } else {
                System.out.println("Invalid argument: " + car);
            }
        }
        System.out.println("Done processing ");

    }
}