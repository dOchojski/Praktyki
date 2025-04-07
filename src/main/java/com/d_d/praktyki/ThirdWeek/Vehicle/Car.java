package com.d_d.praktyki.ThirdWeek.Vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;
    private double fuelCapacity;
    public Car(String brand, int year, int numberOfDoors, double fuelCapacity) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Liczba drzwi: " + numberOfDoors);
        System.out.println("Pojemność paliwa: " + fuelCapacity + " liters");
    }
}

