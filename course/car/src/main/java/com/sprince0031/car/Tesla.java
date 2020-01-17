package com.sprince0031.car;

public class Tesla implements Car, Asset, Property, Loggable, Cloneable {
    
    private Name ownerName;
    private Colour colour;
    public Tesla(Name ownerName, Colour colour) {
        this.ownerName = ownerName;
        this.colour = colour;
    }

    public static Tesla newInstance(Tesla tesla) {
        return new Tesla(Name.newInstance(tesla.ownerName), Colour.newInstance(tesla.colour));
    }

    public void changeOwner(String newOwner) {
        ownerName = new Name(newOwner);
    }

    public void drive() {
        System.out.println("Tesla driving...");
    }

    public int value() {
        return 130000;
    }

    public String owner() {
        return ownerName.name;
    }

    public String message() {
        return "Property of " + ownerName.name;
    }
}