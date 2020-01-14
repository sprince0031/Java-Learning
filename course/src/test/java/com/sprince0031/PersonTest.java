package com.sprince0031;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person sprince0031 = new Person();
        assertEquals("Hello World!", sprince0031.helloWorld());
    }
}