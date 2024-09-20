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
        //exemplo de método usando o bdd style (given -> when -> then)
        //given two positive numbers
        double n1 = 6.2;
        double n2 = 2;

        //when we perform the addition
        double actual = math.addition(n1, n2);

        //then it should return their sum
        double expected = 8.2;
        assertEquals(expected, actual);
    }

    @Test
    void testAdditionTwoNegativeNumbers(){
        //bdd style simplificado sem o "given" já que são valores simples e de facil compreensao

        //when
        double actual = math.addition(-1, -3);

        //then
        double expected = -4;
        assertEquals(expected, actual);
    }

    @Test
    void testAdditionNegativeAndPositiveNumbers(){
        double actual = math.addition(-9, 16);

        double expected = 7;
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
        double actual = math.subtraction(8.2, 2.0);

        double expected = 6.2;
        assertEquals(expected, actual, 0.00000001);
    }

    @Test
    void testSubtractionTwoNegativeNumbers() {
        double actual = math.subtraction(-1, -3);

        double expected = 2D;
        assertEquals(expected, actual);
    }

    @Test
    void testSubtractionNegativeMinusPositive() {
        double actual = math.subtraction(-9, 16);

        double expected = -25;
        assertEquals(expected, actual);
    }

    @Test
    void testSubtractionPositiveMinusNegative() {

        double actual = math.subtraction(16, -9);

        double expected = 25;
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
        double actual = math.multiplication(4, 9);

        double expected = 36;
        assertEquals(expected, actual);
    }

    @Test
    void testMultiplicationTwoNegativeNumbers(){
        double actual = math.multiplication(-6, -6);

        double expected = 36;
        assertEquals(expected, actual);
    }

    @Test
    void testMultiplicationPositiveAndNegativeNumbers(){
        double actual = math.multiplication(-7, 6);

        double expected = -42;
        assertEquals(expected, actual);
    }

    @Test
    void testMultiplicationByZero() {
        double actual = math.multiplication(3, 0);

        double expected = 0;
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
        double actual = math.division(8, 2);

        double expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void testDivisionTwoNegativeNumbers() {
        double actual = math.division(-8, -2);

        double expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void testDivisionPositiveByNegative() {
        double actual = math.division(8, -2);

        double expected = -4;
        assertEquals(expected, actual);
    }

    @Test
    void testDivisionNegativeByPositive() {
        double actual = math.division(-8, 2);

        double expected = -4;
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
        double actual = math.mean(30, 10);

        double expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void testMeanTwoNegativeNumbers(){
        double actual = math.mean(-30, -10);

        double expected = -20;
        assertEquals(expected, actual);
    }

    @Test
    void testMeanNegativeAndPositiveNumbers(){
        double actual = math.mean(-30, 10);

        double expected = -10;
        assertEquals(expected, actual);
    }

    @Test
    void testAverageWithZero() {
        double actual = math.mean(5.0, 0.0);

        double expected = 2.5;
        assertEquals(expected, actual, 0.0000001);
    }

    @Test
    void testAverageWithDecimals() {
        double actual = math.mean(3.7, 5.0);

        double expected = 4.35;
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
        double actual = math.squareRoot(16);

        double expected = 4;
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
        double actual = math.squareRoot(0);

        double expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void testSqrtOfPositiveInfinity() {
        double actual = math.squareRoot(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, actual);
    }

}



