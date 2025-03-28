package com.d_d.praktyki.dziedziczenie2;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Informacje:");
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rok: " + year);
    }
}
