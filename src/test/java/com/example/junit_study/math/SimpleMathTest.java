package com.example.junit_study.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {

    private SimpleMath math;

    @BeforeEach
    void setUp() {
        math = new SimpleMath();
    }


    @Test
    void testAdditionTwoPositiveNumbers(){

        double expected = 6.2;
        double actual = math.addition(6.2, 0);

        assertEquals(expected, actual);
    }

    @Test
    void testAdditionTwoNegativeNumbers(){
        double expected = -4;
        double actual = math.addition(-1, -3);

        assertEquals(expected, actual);
    }

    @Test
    void testAdditionNegativeAndPositiveNumbers(){
        double expected = 7;
        double actual = math.addition(-9, 16);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithInfinity() {
        double actual = math.addition(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, actual, 0.001);
    }




    @Test
    void testSubtractionTwoPositiveNumbers() {
        double expected = 6.2;
        double actual = math.subtraction(8.2, 2.0);

        assertEquals(expected, actual, 0.00000001);
    }

    @Test
    void testSubtractionTwoNegativeNumbers() {
        double expected = 2D;
        double actual = math.subtraction(-1, -3);

        assertEquals(expected, actual);
    }

    @Test
    void testSubtractionNegativeMinusPositive() {
        double expected = -25D;
        double actual = math.subtraction(-9, 16);

        assertEquals(expected, actual);
    }

    @Test
    void testSubtractionPositiveMinusNegative() {
        double expected = 25;
        double actual = math.subtraction(16, -9);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractionWithInfinity() {
        double actual = math.subtraction(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, actual, 0.001);
    }
}



