package com.d_d.praktyki.SecondWeekSecondYear.Conditions;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę do sprawdzenia: ");
        int liczba = scanner.nextInt();

        System.out.print("Podaj swój wiek: ");
        int wiek = scanner.nextInt();

        if (liczba < 0) {
            System.out.println("Liczba " + liczba + " jest ujemna.");
        } else if (liczba > 0) {
            System.out.println("Liczba " + liczba + " jest dodatnia.");
        } else {
            System.out.println("Liczba jest równa zero.");
        }

        switch (liczba) {
            case 1:
                System.out.println("Ocena niedostateczna");
                break;
            case 2:
                System.out.println("Ocena dopuszczająca");
                break;
            case 3:
                System.out.println("Ocena dostateczna");
                break;
            case 4:
                System.out.println("Ocena dobra");
                break;
            case 5:
                System.out.println("Ocena bardzo dobra");
                break;
            case 6:
                System.out.println("Ocena celująca");
                break;
            default:
                System.out.println("Niepoprawna ocena (podaj liczbę od 1 do 6).");
        }

        if (wiek < 0) {
            System.out.println("Wiek nie może być ujemny.");
        } else if (wiek <= 12) {
            System.out.println("Dziecko");
        } else if (wiek <= 18) {
            System.out.println("Nastolatek");
        } else if (wiek <= 64) {
            System.out.println("Dorosły");
        } else {
            System.out.println("Senior");
        }

        scanner.close();
    }
}
