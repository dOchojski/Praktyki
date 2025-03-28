package com.d_d.praktyki.arrayex2;

public class ElevatorTest {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Person passenger1 = new Person();
        passenger1.mass = 50.5f;
        Person passenger2 = new Person();
        passenger2.mass = 70.5f;
        Person passenger3 = new Person();
        passenger1.mass = 120.5f;
        Person passenger4 = new Person();
        passenger1.mass = 90.5f;
        Person passenger5 = new Person();
        passenger1.mass = 80.5f;
        elevator.add(passenger1);
        elevator.add(passenger2);
        elevator.add(passenger3);
        elevator.add(passenger4);
        elevator.add(passenger5);

        elevator.start();
        elevator.empty();
        elevator.start();
    }
}
