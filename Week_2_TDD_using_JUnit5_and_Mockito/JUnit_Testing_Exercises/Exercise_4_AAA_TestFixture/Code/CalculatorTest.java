package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        // Arrange: Setup before each test
        calculator = new Calculator();
        System.out.println("Setup: Calculator instance created");
    }

    @AfterEach
    public void tearDown() {
        // Teardown: Clean-up after each test
        calculator = null;
        System.out.println("Teardown: Calculator instance destroyed");
    }

    @Test
    public void testAddition() {
        // Arrange: Already done in setUp()

        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testAdditionWithZero() {
        int result = calculator.add(7, 0);
        assertEquals(7, result);
    }
}
