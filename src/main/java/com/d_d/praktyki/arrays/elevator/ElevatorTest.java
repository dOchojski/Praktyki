package com.d_d.praktyki.arrays.elevator;

public class ElevatorTest {
    public static void main(String[] args) {
        Person adam = new Person("Adam", 60);
        Person alex = new Person("Alex", 55);
        Person katarzyna = new Person("Katarzyna", 70);
        Person hubert = new Person("Hubert", 80);
        Person zykfryd = new Person("Zykfryd", 75);
        Person antoni = new Person("Antoni", 100);

        Elevator tooHeavyTest = new Elevator();
        tooHeavyTest.add(antoni);
        tooHeavyTest.add(hubert);
        tooHeavyTest.add(katarzyna);
        tooHeavyTest.start();

        Elevator normalTest = new Elevator();
        normalTest.add(adam);
        normalTest.add(alex);
        normalTest.add(katarzyna);
        normalTest.add(zykfryd);
        normalTest.start();

        Elevator tooManyPeopleTest = new Elevator();
        tooManyPeopleTest.add(adam);
        tooManyPeopleTest.add(alex);
        tooManyPeopleTest.add(katarzyna);
        tooManyPeopleTest.add(hubert);
        tooManyPeopleTest.add(zykfryd);
        tooManyPeopleTest.add(antoni);
        normalTest.start();
    }
}
