package com.d_d.praktyki.ThirdWeek.Multi;

public class MultiTest {
    public static void main(String[] args){
        Multi multi1 = new Multi();

        int multi = 1, next =0;
        for(int i=0; i<5; i++){
            System.out.println("Podaj liczbe:");
            next = multi1.input();
            multi *= next;
        }
        multi1.check(multi);
    }
}
