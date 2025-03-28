package com.d_d.praktyki.dziedziczenie2;

public class Bicycle extends Vehicle{
    private int numberOfGears;

    public Bicycle(String brand, String model, int year, int numberOfGears) {
        super(brand, model, year);
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Liczba przerzutek: " + numberOfGears);
    }
}
