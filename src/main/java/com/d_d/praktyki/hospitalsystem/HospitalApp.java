package com.d_d.praktyki.hospitalsystem;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        int option;
        do {
            System.out.println("System Szpitalny:");
            System.out.println("1. Dodaj Pacjenta");
            System.out.println("2. Pokaż Pacjentów");
            System.out.println("0. Wyjśćie");
            System.out.print("Wybierz opcje: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Podaj imię pacjenta: ");
                    String firstName = scanner.next();
                    System.out.print("Podaj nazwisko pacjenta: ");
                    String lastName = scanner.next();
                    System.out.print("Podaj PESEL pacjenta: ");
                    String pesel = scanner.next();

                    Patient newPatient = new Patient(firstName, lastName, pesel);
                    hospital.addPatient(newPatient);
                    break;

                case 2:
                    hospital.displayPatients();
                    break;

                case 0:
                    System.out.println("Wychodzenie z programu.");
                    break;

                default:
                    System.out.println("Niepoprawna opcja. Proszę powtórzyć.");
            }

        } while (option != 0);
    }
}
