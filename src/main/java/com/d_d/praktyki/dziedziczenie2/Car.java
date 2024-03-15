package com.d_d.praktyki.dziedziczenie2;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Liczba drzwi: " + numberOfDoors);
    }
}
