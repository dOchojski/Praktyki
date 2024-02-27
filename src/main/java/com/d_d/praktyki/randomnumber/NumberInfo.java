package com.d_d.praktyki.randomnumber;

import java.util.Random;

public class NumberInfo {

    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        System.out.println("Wylosowana liczba: " + randomNumber);

        checkNumber(randomNumber);

        int result = processNumber(randomNumber);
        System.out.println("Wynik przetwarzania liczby: " + result);
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10000); 
    }

    private static void checkNumber(int number) {
        System.out.println("Sprawdzenie liczby:");
        if (number < 5000) {
            System.out.println("Liczba jest mniejsza od 5000.");
        } else if (number == 5000) {
            System.out.println("Liczba jest równa 5000.");
        } else {
            System.out.println("Liczba jest większa od 5000.");
        }

        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta.");
        } else {
            System.out.println("Liczba jest nieparzysta.");
        }
    }

    private static int processNumber(int number) {
        System.out.println("Przetwarzanie liczby:");

        switch (String.valueOf(number).length()) {
            case 1:
            case 2:
            case 3:
                return Integer.parseInt(String.format("%04d", number));
            case 4:
                return number;
            default:
                return 0;
        }
    }
}

