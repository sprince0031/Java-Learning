package com.sprince0031.car;

import org.junit.Test;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

public class TeslaTest {

    Tesla batsTesla = new Tesla(new Name("Bruce", "Wayne"), new Colour("Black"));
    Tesla supsTesla = Tesla.newInstance(batsTesla);

    @Test
    public void shouldNotReturnReferenceTOSameObject() {     
        assertNotSame(batsTesla, supsTesla);
        System.out.println("Freshly cloned Tesla ready from the cloning oven!");
        System.out.println("batsTesla owned by " + batsTesla.owner());
        System.out.println("supsTesla owned by " + supsTesla.owner());
    }

    @Test
    public void shouldNotHaveTheSameOwnerName() {
        supsTesla.changeOwner("Clark", "Kent");
        assertNotEquals(batsTesla.owner(), supsTesla.owner());
        System.out.println("New identity assigned to cloned Tesla...");
        System.out.println(batsTesla.message());
        System.out.println(supsTesla.message());
    }

    @Test
    public void shouldConvertTeslaToString() {
        System.out.println("Tesla string: " + batsTesla.toString());
        System.out.println("Just Tesla: " + batsTesla); // Same function as the toString() method.
    }

}