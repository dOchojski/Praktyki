package com.d_d.praktyki.loops.hospital;

import com.d_d.praktyki.input.InputPrompt;

import java.util.Scanner;

public class HospitalTest {
    private static final InputPrompt inputPrompt = new InputPrompt(new Scanner(System.in));

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            String option = inputPrompt.prompt(
                    "0 - wyjście z programu" + "\n" +
                    "1 - dopisywanie pacjenta" + "\n" +
                    "2 - wyświetlanie zapisanych pacjentów");

            switch (option) {
                case "0":
                    isRunning = false;
                    break;
                case "1":
                    break;
                case "2":
                    break;
            }
        }
    }
}
