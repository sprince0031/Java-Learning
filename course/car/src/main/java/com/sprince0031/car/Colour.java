package com.sprince0031.car;

public class Colour {
    String colour; 
    public Colour(String colour) {
        this.colour = colour;
    }

    public static Colour newInstance(Colour colour) {
        return new Colour(colour.colour);
    }
}