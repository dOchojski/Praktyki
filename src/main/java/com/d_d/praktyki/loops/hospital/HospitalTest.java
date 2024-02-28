package com.d_d.praktyki.loops.hospital;

import com.d_d.praktyki.input.InputPrompt;

import java.util.Scanner;

public class HospitalTest {
    private static final Hospital hospital = new Hospital();
    private static final InputPrompt inputPrompt = new InputPrompt(new Scanner(System.in));

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            String option = inputPrompt.prompt(
                    "== Szpital =="
                    "0 - wyjście z programu" + "\n" +
                    "1 - dopisywanie pacjenta" + "\n" +
                    "2 - wyświetlanie zapisanych pacjentów");

            switch (option) {
                case "0":
                    isRunning = false;
                    break;
                case "1":
                    addInMenu();
                    break;
                case "2":
                    break;
            }
        }
    }

    private static void addInMenu() {
        boolean isRunning = true;
        while (isRunning) {
            String option = inputPrompt.prompt(
                    "== Dopisywanie pacjenta ==" + "\n" +
                    "0 - wyjście z menu" + "\n" +
                    "1 - wprowadzenie danych");

            switch (option) {
                case "0": {
                    isRunning = false;
                    break;
                }
                case "1": {
                    String name = inputPrompt.prompt("Imię: ");
                    String surname = inputPrompt.prompt("Nazwisko: ");
                    String pesel = inputPrompt.prompt("Pesel: ");

                    boolean success = hospital.add(new Patient(name, surname, pesel));
                    if (success) {
                        System.out.println("Dodano!");
                    }
                    else {
                        System.out.println("Przekroczono maksymalną ilość pacjentów.");
                    }
                }
            }
        }
    }
}
