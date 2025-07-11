package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);
        System.out.println("assertEquals passed");

        assertTrue(5 > 3);
        System.out.println("assertTrue passed");

        assertFalse(5 < 3);
        System.out.println("assertFalse passed");

        assertNull(null);
        System.out.println("assertNull passed");

        assertNotNull(new Object());
        System.out.println("assertNotNull passed");
    }

}
