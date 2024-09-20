package com.example.junit_study.math;

public class SimpleMath {

    public double subtraction(double n1, double n2){
        return n1 - n2;
    }

    public double addition(double n1, double n2){
        return n1 + n2;
    }

    public double multiplication(double n1, double n2){
        return n1 * n2;
    }

    public double division(double n1, double n2){
        return n1/n2;
    }

    public double mean(double n1, double n2){
        return (n1 + n2)/2;
    }

    public double squareRoot(double n){
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(n);
    }
}
