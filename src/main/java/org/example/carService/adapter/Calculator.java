package org.example.carService.adapter;

import java.util.Arrays;

public class Calculator {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sumarray(int[] array) {
        int sum1 = 0;
        for (int element : array) {
            sum1 += element;
        }
        return sum1;
    }

    public int sUm(int firstNum, int... otherNums) {
        int result1 = 0;
        for (int number : otherNums) {
            result1 += number;
        }
        return result1;
    }

    public int difference(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double division(int num1, int num2) {
        double result = (double) num1 / num2;
        if (num1 % num2 == 1) {
        } else {
        }
        return result;
    }
}


