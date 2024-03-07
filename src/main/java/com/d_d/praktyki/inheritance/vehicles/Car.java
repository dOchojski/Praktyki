package com.d_d.praktyki.inheritance.vehicles;

public class Car implements Vehicle {
    @Override
    public void displayInfo() {
        System.out.println("Samochód ma cztery koła (czasem trzy) i silnik który je napędza.");
    }
}
