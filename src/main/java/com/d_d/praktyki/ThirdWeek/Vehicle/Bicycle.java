package com.d_d.praktyki.ThirdWeek.Vehicle;

public class Bicycle extends Vehicle {
    private int numberOfGears;

    public Bicycle(String brand, int year, int numberOfGears) {
        super(brand, year);
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Liczba biegów: " + numberOfGears);
    }
}

