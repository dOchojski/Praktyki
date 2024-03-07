package com.d_d.praktyki.inheritance.vehicles;

public class Bicycle implements Vehicle {
    @Override
    public void displayInfo() {
        System.out.println("Rower ma dwa koła i jest napędzany siłą mięśni.");
    }
}
