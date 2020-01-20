package com.sprince0031.car;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

public class PorsheTest {

    @Test
    public void shouldAssertThatBothObjectsAreNotSame() {
        Porshe supsPorshe = new Porshe(new Name ("Clark", "Kent"));
        Porshe batsPorshe = supsPorshe.clone();
        assertNotSame(supsPorshe, batsPorshe);
    }

    @Test
    public void shouldReturnDifferentOwnersOfPorshes() {
        Porshe supsPorshe = new Porshe(new Name ("Clark", "Kent"));
        Porshe batsPorshe = supsPorshe.clone();
        assertEquals(supsPorshe.owner(), batsPorshe.owner()); // both values are same initially.
        System.out.println(batsPorshe.message());

        batsPorshe.sellCar(new Name ("Bruce", "Wayne"), 170960);
        assertNotEquals(supsPorshe.owner(), batsPorshe.owner()); // new owner value set now.
        System.out.println(batsPorshe.message());
        
    }

}