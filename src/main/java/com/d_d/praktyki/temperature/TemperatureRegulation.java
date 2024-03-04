package com.d_d.praktyki.temperature;

import java.util.Scanner;

public class TemperatureRegulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj aktualną temperaturę: ");
        double currentTemperature = scanner.nextDouble();

        System.out.print("Podaj oczekiwaną temperaturę: ");
        double targetTemperature = scanner.nextDouble();

        while (Math.abs(currentTemperature - targetTemperature) >= 0.5) {
            if (currentTemperature < targetTemperature) {
                currentTemperature += 0.5;
            } else {
                currentTemperature -= 0.5;
            }

            System.out.println("Aktualna temperatura: " + currentTemperature + "°C");
        }
        System.out.println("Osiągnięto oczekiwaną temperaturę. Program zakończony.");
    }
}
