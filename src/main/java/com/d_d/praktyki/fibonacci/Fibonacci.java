package com.d_d.praktyki.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("N: ");
        int nth = scanner.nextInt();
        System.out.printf("Rekurencyjnie: %s\n", fib_rec(nth).toString());
        System.out.printf("Iteracyjnie: %s\n", fib_iter(nth).toString());
    }

    private static BigInteger fib_rec(int n) {
        if (n <= 2) return BigInteger.ONE;
        return fib_rec(n-1).add(fib_rec(n-2));
    }

    private static BigInteger fib_iter(int n) {
        BigInteger current = BigInteger.ONE;
        BigInteger prev = BigInteger.ZERO;
        for (int i=1; i<n; i++) {
            BigInteger temp = current;
            current = current.add(prev);
            prev = temp;
        }
        return current;
    }
}
