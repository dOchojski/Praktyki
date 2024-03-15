package com.d_d.praktyki.RandomGuesser;


public class GuessTest {
    public static void main(String[] args){

        GuessNumber guessNum = new GuessNumber();

        System.out.println("_-_-_-_-_-_ZGADYWANIE-_-LICZBY_-_-_-_-_-_");
        boolean Guessing = false;
        boolean Guessed = true;
        while (Guessed != Guessing){
            Guessing = guessNum.Guessing();
        }
    }
}
