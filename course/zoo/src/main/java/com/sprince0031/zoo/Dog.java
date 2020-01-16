package com.sprince0031.zoo;

public class Dog extends Animals implements Printable {
    public void eat() {
        System.out.println("Dog is chewing a bone.");
    }

    public String message() {
        return ("Woof woof!");
    }

    public void print() {
        System.out.println("Printing just for the sake of it...");
    }
}