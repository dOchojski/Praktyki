package com.d_d.praktyki.calculator;

public class CalcTest {
    public static void main(String[] args) {
        assert Calculator.add(5,4,3) == 12;
        assert Calculator.subtract(10, 1) == 9;
        assert Calculator.subtract(10, 2, 3) == 5;
    }
}
