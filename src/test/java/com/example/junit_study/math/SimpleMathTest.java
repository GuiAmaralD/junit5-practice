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

        double expected = 6.2D;
        double actual = math.addition(6.2D, 0);

        assertEquals(expected, actual);
    }

    @Test
    void testAdditionTwoNegativeNumbers(){
        double expected = -4D;
        double actual = math.addition(-1D, -3D);

        assertEquals(expected, actual);
    }

    @Test
    void testAdditionNegativeAndPositiveNumbers(){
        double expected = 7D;
        double actual = math.addition(-9D, 16D);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithInfinity() {
        double actual = math.addition(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, actual, 0.001);
    }

    
}
