package com.sprince0031.car;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.sprince0031.car.other.Enum.LoggingLevel;
import com.sprince0031.car.other.Enum;

public class EnumTest {

    @Test
    public void shouldReturnPROCESSED() {
        assertEquals(LoggingLevel.PROCESSED, new Enum().getLoggingLevel());
    }
}