package com.d_d.praktyki.dziedziczenie2;

public class VehicleTest {
    public static void main(String[] args) {
        {
            Car car = new Car("Dodge", "Challenger SRT 170 Demon", 2022, 2);
            Bicycle bicycle = new Bicycle("Giant", "Escape", 2022, 21);

            car.displayInfo();
            System.out.println("\n----------------\n");
            bicycle.displayInfo();
        }
    }
}
