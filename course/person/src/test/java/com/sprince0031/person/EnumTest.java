package com.sprince0031.person;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.sprince0031.person.Enum.LoggingLevel;
import com.sprince0031.person.Enum;

public class EnumTest {

    @Test
    public void shouldReturnPROCESSED() {
        assertEquals(LoggingLevel.PROCESSED, new Enum().getLoggingLevel());
    }
}