package com.d_d.praktyki.ThirdWeek.Vehicle;

public class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Marka: " + brand);
        System.out.println("Rok: " + year);
    }
}

