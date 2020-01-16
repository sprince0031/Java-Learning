package com.sprince0031.person;

import com.sprince0031.person.attributes.Name;

public class Person {

    private static int personCount = 0;
    public Person () {
        // Explicitly defined default constructor for no real reason. 
        personCount++;
    }

    public static int getPersonCount() {
        return personCount;
    }

    private String name = "Sprince0031";
    private Name personName = new Name(name);

    public String hello(String name) {
        return "Hello " + name + "!";
    }

    public Name getName() {
        return personName;
    }
    
    public String helloWorld() {
        return "Hello World!";
    }

}