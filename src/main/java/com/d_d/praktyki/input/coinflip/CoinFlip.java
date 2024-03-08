package com.d_d.praktyki.input.coinflip;

import com.d_d.praktyki.input.InputPrompt;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    private enum Coin {
        TAILS, HEADS;

        private static final Random random = new Random();

        public static final Coin getRandom() {
            return values()[random.nextInt(values().length)];
        }
    };
    private static final InputPrompt inputPrompt = new InputPrompt(new Scanner(System.in));

    public static void main(String[] args) {
        flip();
    }

    public static void flip() {
        String choice = inputPrompt.prompt("Wybierz jedną z dwóch opcji\n0 - Reszka\n1 - Orzeł");
        int coinIndex = Integer.parseInt(choice);
        Coin chosenCoin = switch(coinIndex) {
            case 0 -> Coin.TAILS;
            case 1 -> Coin.HEADS;
            default -> throw new IllegalStateException("Unexpected value: " + coinIndex);
        };

        if (chosenCoin == Coin.getRandom()) {
            System.out.println("Wygrywasz!");
        }
        else {
            System.out.println("Przegrywasz :c");
        }
    }

}
