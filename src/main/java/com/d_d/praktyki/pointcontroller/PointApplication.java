package com.d_d.praktyki.pointapplication;

import java.util.Scanner;

public class PointApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współrzędne punktu (x y):");
        int initialX = scanner.nextInt();
        int initialY = scanner.nextInt();

        Point point = new Point(initialX, initialY);
        PointController pointController = new PointController();

        while (true) {
            System.out.println("Aktualne koordynaty: " + point);

            System.out.println("Wybierz opcje:");
            System.out.println("1. Przesuń w lewo");
            System.out.println("2. Przesuń w prawo");
            System.out.println("3. Przesuń do góry");
            System.out.println("4. Przesuń na dół");
            System.out.println("0. Wyjście");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pointController.moveLeft(point);
                    break;
                case 2:
                    pointController.moveRight(point);
                    break;
                case 3:
                    pointController.moveUp(point);
                    break;
                case 4:
                    pointController.moveDown(point);
                    break;
                case 0:
                    System.out.println("Opuszczanie programu.");
                    System.exit(0);
                default:
                    System.out.println("Niepoprawny wybór. Prosze wybrać właściwą opcję.");
            }
        }
    }
}

