package com.d_d.praktyki.arrays.elevator;

public class ElevatorTest {
    public static void main(String[] args) {
        Elevator tooHeavyTest = new Elevator();
        tooHeavyTest.add();
        tooHeavyTest.add();
        tooHeavyTest.add();
        tooHeavyTest.start();

        Elevator normalTest = new Elevator();
        normalTest.add();
        normalTest.add();
        normalTest.add();
        normalTest.add();
        normalTest.start();

        Elevator tooManyPeopleTest = new Elevator();
        tooManyPeopleTest.add();
        tooManyPeopleTest.add();
        tooManyPeopleTest.add();
        tooManyPeopleTest.add();
        tooManyPeopleTest.add();
        normalTest.start();
    }
}
