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



    //addition tests
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
    void testAddWithInfinity() {
        double actual = math.addition(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, actual, 0.001);
    }



    //subtraction tests
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
    void testSubtractionWithInfinity() {
        double actual = math.subtraction(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, actual, 0.001);
    }



    //multiplication tests
    @Test
    void testMultiplicationTwoPositiveNumbers(){
        double expected = 36;
        double actual = math.multiplication(4, 9);

        assertEquals(expected, actual);
    }

    @Test
    void testMultiplicationTwoNegativeNumbers(){
        double expected = 36;
        double actual = math.multiplication(-6, -6);

        assertEquals(expected, actual);
    }

    @Test
    void testMultiplicationPositiveAndNegativeNumbers(){
        double expected = -42;
        double actual = math.multiplication(-7, 6);

        assertEquals(expected, actual);
    }

    @Test
    void testMultiplicationByZero() {
        double expected = 0;
        double actual = math.multiplication(3, 0);

        assertEquals(expected, actual);
    }

    @Test
    void testMultiplicationWithPositiveInfinity() {
        double actual = math.multiplication(4, Double.POSITIVE_INFINITY);

        assertEquals(Double.POSITIVE_INFINITY, actual);
    }

    //division tests
    @Test
    void testDivisionTwoPositiveNumbers() {
        double expected = 4;
        double actual = math.division(8, 2);

        assertEquals(expected, actual);
    }

    @Test
    void testDivisionTwoNegativeNumbers() {
        double expected = 4;
        double actual = math.division(-8, -2);

        assertEquals(expected, actual);
    }

    @Test
    void testDivisionPositiveByNegative() {
        double expected = -4;
        double actual = math.division(8, -2);

        assertEquals(expected, actual);
    }

    @Test
    void testDivisionNegativeByPositive() {
        double expected = -4;
        double actual = math.division(-8, 2);

        assertEquals(expected, actual);
    }

    @Test
    void testDivisionPositiveByZero() {
        double actual = math.division(8.0, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, actual);
    }

    @Test
    void testDivisionNegativeByZero(){
        double actual = math.division(-8, 0);
        assertEquals(Double.NEGATIVE_INFINITY, actual);
    }


    //mean tests
    @Test
    void testMeanTwoPositiveNumbers(){
        double expected = 20;
        double actual = math.mean(30, 10);

        assertEquals(expected, actual);
    }

    @Test
    void testMeanTwoNegativeNumbers(){
        double expected = -20;
        double actual = math.mean(-30, -10);

        assertEquals(expected, actual);
    }

    @Test
    void testMeanNegativeAndPositiveNumbers(){
        double expected = -10;
        double actual = math.mean(-30, 10);

        assertEquals(expected, actual);
    }

    @Test
    void testAverageWithZero() {
        double expected = 2.5;
        double actual = math.mean(5.0, 0.0);

        assertEquals(expected, actual, 0.0000001);
    }

    @Test
    void testAverageWithDecimals() {
        double expected = 4.35;
        double actual = math.mean(3.7, 5.0);

        assertEquals(expected, actual, 0.0000001);
    }

    @Test
    void testAverageWithPositiveInfinity() {
        double actual = math.mean(Double.POSITIVE_INFINITY, 10.0);
        assertEquals(Double.POSITIVE_INFINITY, actual);
    }

    @Test
    void testAverageWithNegativeInfinity() {
        double actual = math.mean(Double.NEGATIVE_INFINITY, 10.0);
        assertEquals(Double.NEGATIVE_INFINITY, actual);
    }

    //square root tests
    @Test
    void testSqrtPositiveNumber(){
        double expected = 4;
        double actual = math.squareRoot(16);

        assertEquals(expected, actual);
    }

    @Test
    void testSqrtOfNegativeNumberThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            math.squareRoot(-4.0);
        });

        assertEquals("Cannot calculate square root of a negative number", exception.getMessage());
    }

    @Test
    void testSqrtOfZero(){
        double expected = 0;
        double actual = math.squareRoot(0);

        assertEquals(expected, actual);
    }

    @Test
    void testSqrtOfPositiveInfinity() {
        double actual = math.squareRoot(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, actual);
    }

}



