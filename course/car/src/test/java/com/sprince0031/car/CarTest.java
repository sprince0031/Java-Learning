package com.sprince0031.car;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void shouldReturnDoneProcessing() throws Exception {
        // CarSelector carSelector = new CarSelector();
        String[] arguments = {"QUEUED", "SERVICING", "SERVICED"};
        CarSelector carSelector = new CarSelector();
        assertEquals("Done processing", carSelector.processArguments(arguments));
    }

}