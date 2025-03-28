package com.d_d.praktyki.guessnumber;

import java.util.Random;
public class GuessNumber {
    Random rand = new Random();
    int x = rand.nextInt(100);

    public void compareNumbers(int userPick){
        if(userPick == x){
            System.out.println("Brawo zgadłeś liczbę!");
        }
        if(userPick > x){
            System.out.println("Za dużo");
        }
        if(userPick < x){
            System.out.println("Za mało");
        }
    }
}
