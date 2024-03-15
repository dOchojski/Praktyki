package com.d_d.praktyki.ThirdWeek.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Ogólny pojazd", 2022);
        System.out.println("=== Vehicle ===");
        vehicle.displayInfo();
        System.out.println();

        Car car = new Car("Toyota", 2020, 4, 50.5);
        System.out.println("=== Car ===");
        car.displayInfo();
        System.out.println();

        Bicycle bicycle = new Bicycle("Giant", 2019, 21);
        System.out.println("=== Bicycle ===");
        bicycle.displayInfo();
    }
}
