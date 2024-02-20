package com.d_d.praktyki.guessnumber;

import java.util.Scanner;

public class GuessTest {
    public static void main(String[] args) {
        GuessNumber guess = new GuessNumber();

        System.out.println("=== Zgadnij liczbę ===");
        boolean has_win = false;
        while (!has_win /*number was not guessed*/) {
            has_win = guess.prompt();
        }
    }
}
