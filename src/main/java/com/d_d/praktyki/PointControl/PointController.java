package com.d_d.praktyki.PointControl;

import java.util.Scanner;

public class PointController {
    private static final Scanner control = new Scanner(System.in);
    private static int distance;

    public static boolean End(){

        return true;
    }
    public static int Left(int x){
        System.out.println("Podaj ile chcesz się przesunąć:");
        distance = control.nextInt();
        return x - distance;
    }
    public static int Up(int y){
        System.out.println("Podaj ile chcesz się przesunąć:");
        distance = control.nextInt();
        return y + distance;
    }
    public static int Down(int y){
        System.out.println("Podaj ile chcesz się przesunąć:");
        distance = control.nextInt();
        return y- distance;
    }
    public static int Right(int x){
        System.out.println("Podaj ile chcesz się przesunąć:");
        distance = control.nextInt();
        return x + distance;
    }
    public static void Controls(){
        System.out.println("Sterowanie punktu:\n0-Zakończyć program\n1-Lewo\n2-Góra\n3-Dół\n4-Prawo\n7-Przypomienie sterowania");
    }

}
