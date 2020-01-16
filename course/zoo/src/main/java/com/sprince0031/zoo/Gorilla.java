package com.sprince0031.zoo;

public class Gorilla extends Animals {
    @Override
    public void eat() {
        System.out.println("Gorilla is having a vegetarian diet of fresh leaves today.");
    }
    @Override
    public String grow(String animal) {
        return "Gorilla is growing and aging too."; // This does not include any of the lines of code in the super class.
    }
    @Override
    public String message() {
        return "Ooh ooh aah aah aaaah!";
    }
}