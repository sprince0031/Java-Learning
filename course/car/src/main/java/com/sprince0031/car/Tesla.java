package com.sprince0031.car;

public class Tesla implements Car, Asset, Property, Loggable {
    
    public void drive() {
        System.out.println("Tesla driving...");
    }

    public int value() {
        return 130000;
    }

    public String owner() {
        return "Sprince0031";
    }

    public String message() {
        return "Property of Sprince0031";
    }
}