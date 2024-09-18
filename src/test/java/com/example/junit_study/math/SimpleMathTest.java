package com.example.junit_study.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {

    @Test
    void test(){
        SimpleMath math = new SimpleMath();
        Double expected = 8.2D;
        Double actual = math.addition(6.2D, 2D);

        assertEquals(expected, actual);
    }
}
