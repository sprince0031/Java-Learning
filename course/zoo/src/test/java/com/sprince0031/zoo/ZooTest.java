package com.sprince0031.zoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZooTest {
    
    @Test
    public void shouldDoStuffFromDog() {
        Animals dog = new Dog();
        dog.eat(); // Abstract Animal method overriden in Dog class
        assertEquals("Dog is growing.", dog.grow("Dog")); // Method directly defined in Animal class
        assertEquals("Woof woof!", dog.message()); // Method defined in Loggable interface implemented in Animal class
        Dog dog2 = new Dog(); // Required to get functionality that is exclusive to Dog class, here print(). This method was defined in Printable interface which was implemented only in Dog class.
        dog2.print();
    }

    @Test
    public void shouldDoTigerStuff() {
        Animals tiger = new Tiger();
        tiger.eat();
        assertEquals("Tiger is growing.", tiger.grow("Tiger"));
        assertEquals("Meeoow! Oops! Rooaar!", tiger.message());
    }

    @Test
    public void shouldDoGorillaStuff() {
        Animals gorilla = new Gorilla();
        gorilla.eat();
        assertEquals("Gorilla is growing and aging too.", gorilla.grow("Gorilla"));
        assertEquals("Ooh ooh aah aah aaaah!", gorilla.message());
    }

}
