package com.d_d.praktyki.SecondWeek.Temperatura;

import java.util.Scanner;

public class TemperaturaTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj aktualną temperaturę w stopniach Celsiusza: ");
        int currentTemp = scanner.nextInt();

        System.out.print("Podaj oczekiwaną temperaturę w stopniach Celsiusza: ");
        int targetTemp = scanner.nextInt();

        Temperatura.regulateTemperature(currentTemp, targetTemp);

    }
}
