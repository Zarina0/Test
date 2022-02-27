package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    Math math;

    @Before
    public void init() {
        math = new Math();
    }

    @Test
    public void addTest() {
        assertEquals("10", math.add("6", "4"));
    }

    @Test
    public void divideTest() {
        assertEquals("2", math.divide("10", "5"));
    }

    @Test

    public void multiplyTest() {
        assertEquals("20", math.multiply("5", "4"));
    }

    @Test
    public void subtractionTest() {
        assertEquals("102", math.subtract("120", "18"));
    }

    @Test
    public void testForGaps() {
        assertEquals("22", math.add("      12    ", "  10   "));
    }

    @Test
    public void negativeNumberTest() {
        assertEquals("Error, you entered a negative number", math.add("-10", "9"));

    }

    @Test
    public void isDividedByZero() {
        assertEquals("Error,you can't divide by zero", math.dividedByZero("5", "0"));
    }

    @Test
    public void characterTest() {
        assertEquals("Error, you can't enter special characters", math.areSymbolsIncluded("#^:5468", "6754"));
    }

    @After
    public void detach() {
        math = null;
    }
}
