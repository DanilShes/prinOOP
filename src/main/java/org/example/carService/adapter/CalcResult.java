package org.example.carService.adapter;

public class CalcResult {
    public static void main(String[] args) {

       Calculator calculator = new Calculator();
        System.out.println(calculator.sum(4,6));
        System.out.println(calculator.sumarray(new int[]{10,20,30}));
        System.out.println(calculator.sUm(2,10,30));
        System.out.println(calculator.difference(10,5));
        System.out.println(calculator.multiply(5,10));
        System.out.println(calculator.division(13,2));
    }
}
