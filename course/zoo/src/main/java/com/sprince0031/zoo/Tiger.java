package com.sprince0031.zoo;

public class Tiger extends Animals {
    @Override
    public void eat() {
        System.out.println("Tiger is chomping at a freshly killed gazelle.");
    }
    @Override
    public String message() {
        return "Meeoow! Oops! Rooaar!";
    }
}