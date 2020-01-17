package com.sprince0031.car;

public class Name {
    String name; 
    public Name(String name) {
        this.name = name;
    }

    public static Name newInstance(Name name) {
        return new Name(name.name);
    }
}