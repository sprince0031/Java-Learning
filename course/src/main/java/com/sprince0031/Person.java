package com.sprince0031;

import com.sprince0031.attributes.Name;

public class Person {

    public Person () {
        // Explicitly defined default constructor for no real reason. 
        
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