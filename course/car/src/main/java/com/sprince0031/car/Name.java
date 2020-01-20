package com.sprince0031.car;

public class Name {
    String firstname, lastname; 
    public Name(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public static Name newInstance(Name name) {
        return new Name(name.firstname, name.lastname);
    }
}