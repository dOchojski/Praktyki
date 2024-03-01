package com.d_d.praktyki.SecondWeek.Temperatura;

public class Temperatura {

    public static void regulateTemperature(double currentTemp, int targetTemp) {
        while (currentTemp != targetTemp) {
            if (currentTemp < targetTemp) {
                currentTemp += 0.5;
                System.out.println("Aktualna temperatura: " + currentTemp + "°C");
            } else if (currentTemp > targetTemp) {
                currentTemp -= 0.5;
                System.out.println("Aktualna temperatura: " + currentTemp + "°C");
            }
        }
        System.out.println("Temperatura docelowa osiągnięta.");
    }
}
