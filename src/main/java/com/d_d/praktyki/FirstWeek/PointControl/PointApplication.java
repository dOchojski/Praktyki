package com.d_d.praktyki.PointControl;

import java.util.Scanner;

public class PointApplication {
    private static final Scanner control = new Scanner(System.in);
    public static void main(String[] args){
        int x,y;
        char choice;
        boolean finish=false;
        System.out.println("Podaj współrzędne punktu (x-poziom,y-pion):\nPoziom: ");
        x = control.nextInt();
        System.out.println("Pion: ");
        y = control.nextInt();
        PointController.Controls();

        while (!finish){

            System.out.println("Control: ");
            choice = control.next().charAt(0);
            switch(choice){
                case '0' -> finish = PointController.End();
                case '1' -> x = PointController.Left(x);
                case '2' -> y = PointController.Up(y);
                case '3' -> y = PointController.Down(y);
                case '4' -> x = PointController.Right(x);
                case '7' -> PointController.Controls();
                default -> System.out.println("Zły symbol.");
            }
            System.out.println("Poziome współrzędne: " + x + "\nPionowe współrzędne: " + y);
        }
    }
}
