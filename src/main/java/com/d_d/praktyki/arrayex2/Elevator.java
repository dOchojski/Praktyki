package com.d_d.praktyki.arrayex2;

public class Elevator {
    private Person[] passengers;
    private int passengersCount;
    private static final int MASA_MAX = 400;

    public Elevator() {
        this.passengers = new Person[4];
        this.passengersCount = 0;
    }

    public void add(Person person) {
        if (passengersCount < 4) {
            passengers[passengersCount] = person;
            passengersCount++;
            System.out.println("Osoba dodana do windy: " + person);
        } else {
            System.out.println("Winda jest pełna, nie można dodać więcej osób!");
        }
    }
    public void start() {
        int weight = calcWeight();
        if (weight > MASA_MAX) {
            System.out.println("Winda jest przeciążona o " + (weight - MASA_MAX) + " kg!");
        } else if (passengersCount > 0) {
            System.out.println("Winda wystartowała.");
        } else {
            System.out.println("Winda jest pusta. Nie można wystartować.");
        }
    }
    public void empty() {
        if (passengersCount > 0) {
            passengersCount = 0;
            System.out.println("Winda została opróżniona.");
        } else {
            System.out.println("Winda jest już pusta.");
        }
    }
    private int calcWeight() {
        int suma = 0;
        for (int i = 0; i < passengersCount; i++) {
            suma += passengers[i].getMass();
        }
        return suma;
    }
}