package com.d_d.praktyki.input.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
//        Calculator.prompt();
        InputPrompt input = new InputPrompt(new Scanner(System.in));
        input.promptDouble("AAA", true);
    }
}
