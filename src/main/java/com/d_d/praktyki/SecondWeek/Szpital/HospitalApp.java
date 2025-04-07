package com.d_d.praktyki.SecondWeek.Szpital;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        int option = 1;
        while (option != 0) {
            System.out.println("\nMenu:");
            System.out.println("0 - Wyjście z programu");
            System.out.println("1 - Dopisanie pacjenta");
            System.out.println("2 - Wyświetlenie listy zapisanych pacjentów");
            System.out.print("Wybierz opcję: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 0:
                    System.out.println("Wyjście z programu.");
                    break;
                case 1:
                    if (hospital != null) {
                        System.out.println("Podaj imię pacjenta:");
                        String firstName = scanner.nextLine();
                        System.out.println("Podaj nazwisko pacjenta:");
                        String lastName = scanner.nextLine();
                        System.out.println("Podaj PESEL pacjenta:");
                        String pesel = scanner.nextLine();
                        hospital.addPatient(new Patient(firstName, lastName, pesel));
                    }
                    break;
                case 2:
                    if (hospital != null) {
                        hospital.displayPatients();
                    }
                    break;
                default:
                    System.out.println("Niepoprawna opcja. Wybierz ponownie.");
            }
        }

        scanner.close();
    }
}
