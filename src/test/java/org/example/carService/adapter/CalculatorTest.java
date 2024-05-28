package org.example.carService.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(4,6);
        assertEquals(10,result);
    }

    @Test
    void sumarray() {
        Calculator calculator = new Calculator();
        int result = calculator.sumarray(new int[]{10,20,30});
        assertEquals(60, result);
    }

    @Test
    void sUm() {
        Calculator calculator = new Calculator();
        int result = calculator.sUm(5,10,15);
        assertEquals(25,result);
    }

    @Test
    void difference() {
        Calculator calculator = new Calculator();
        int result = calculator.difference(10,5);
        assertEquals(5,result);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(12,2);
        assertEquals(24,result);
    }

    @Test
    void division() {
        Calculator calculator = new Calculator();
        double result = calculator.division(13,2);
        assertEquals(6.5,result);
    }
}