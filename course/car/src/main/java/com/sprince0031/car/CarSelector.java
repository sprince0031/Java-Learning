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

    public String processArguments(String[] arguments) {
        for (String car: arguments) {
            if (isValid(car)) {
                System.out.println("Processing " + car);
            } else {
                System.out.println("Invalid argument: " + car);
            }
        }
        return "Done processing";
    }
    public static void main(String[] arguments) throws Exception {
        // CarService carService = new CarService();
        String result = new CarSelector().processArguments(arguments);
        System.out.println(result);
        
        Porshe porshe = new Porshe(new Name("Manoj.", " M"));

        try {
            porshe.plugInOut();
            porshe.plugInOut();
            System.out.println("The estimated range left in the Tycan is " + porshe.checkCarRange() + " km");
        } finally {
            porshe.close();
        }
        
    }
}