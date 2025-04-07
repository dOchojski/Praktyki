package com.d_d.praktyki.SecondWeekSecondYear.String;

import java.util.Locale;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy String:");
        String str1 = scanner.nextLine();
        System.out.println("Podaj drugi String:");
        String str2 = scanner.nextLine();

        String connectedString = str1 + str2;
        System.out.println("Połączony String: " + connectedString);

        String literalString = "Hello";
        String newString = new String("Hello");

        System.out.println("\nPorównanie String:");
        System.out.println("literalString == newString: " + (literalString == newString));
        System.out.println("literalString.equals(newString): " + literalString.equals(newString));

        System.out.println("\nSprawdzenie, czy String jest palindromem:");
        System.out.println("Czy \"" + str1 + "\" jest palindromem? " + isPalindrome(str1));
    }

    public static boolean isPalindrome(String str) {
        str =str.toLowerCase();
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

