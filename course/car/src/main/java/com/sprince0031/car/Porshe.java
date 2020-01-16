package com.sprince0031.car;

public class Porshe implements Car, Asset, Property, Loggable {
    
    public void drive() {
        System.out.println("Porshe driving...");
    }

    public int value() {
        return 188960;
    }

    public String owner() {
        return "Manoj. M";
    }

    public String message() {
        return "Property of Manoj. M";
    }
}