package com.sprince0031;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.sprince0031.attributes.Name;

public class PersonTest {

    @Test
    public void shouldReturnNumberOfPersons() {
        Person Manoj = new Person();
        assertEquals(1, Manoj.getPersonCount());
        Person Prici = new Person();
        assertEquals(2, Person.getPersonCount());
        Person Kiru = new Person();
        assertEquals(3, Kiru.getPersonCount());
        Person Sprince = new Person();
        assertEquals(4, Sprince.getPersonCount());
    }

    @Test
    public void shouldReturnHelloWorld() {
        Person sprince0031 = new Person();
        assertEquals("Hello World!", sprince0031.helloWorld());
        
    }

    @Test
    public void shouldReturnNameObject() {
        Person sprince0031 = new Person();
        assertEquals(new Name("Sprince0031").name, sprince0031.getName().name);
    }

    @Test
    public void shouldReturnHelloSprince0031() {
        Person sprince0031 = new Person();
        assertEquals("Hello Sprince0031!", sprince0031.hello("Sprince0031"));
    }

}