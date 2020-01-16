package com.sprince0031.zoo;

public abstract class Animals implements Loggable {
    public abstract void eat();

    public String grow(String animal) {
        if (animal == "Gorilla") {
            System.out.println("Look at me! I'm climbing a tree!!");
        }
        return animal + " is growing.";
    }
}
