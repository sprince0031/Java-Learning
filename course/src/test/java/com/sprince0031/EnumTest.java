package com.sprince0031;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.sprince0031.Enum.LoggingLevel;
import com.sprince0031.Enum;

public class EnumTest {

    @Test
    public void shouldReturnPROCESSED() {
        assertEquals(LoggingLevel.PROCESSED, new Enum().getLoggingLevel());
    }
}