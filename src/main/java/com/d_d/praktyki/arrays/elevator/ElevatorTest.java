package com.d_d.praktyki.arrays.elevator;

public class ElevatorTest {
    public static void main(String[] args) {
        Person adam = new Person("Adam", 60);
        Person alex = new Person("Alex", 55);
        Person katarzyna = new Person("Katarzyna", 70);
        Person hubert = new Person("Hubert", 80);
        Person zykfryd = new Person("Zykfryd", 75);
        Person antoni = new Person("Antoni", 100);
        Person ciezarek = new Person("Ciężarek 300 kg", 300);

        System.out.println("== Too heavy test ==");
        Elevator tooHeavyTest = new Elevator();
        tooHeavyTest.add(antoni);
        tooHeavyTest.add(hubert);
        tooHeavyTest.add(ciezarek);
        tooHeavyTest.start();
        tooHeavyTest.clear();
        tooHeavyTest.add(ciezarek);
        tooHeavyTest.start();
        System.out.println();

        System.out.println("== Normal test ==");
        Elevator normalTest = new Elevator();
        normalTest.add(adam);
        normalTest.add(alex);
        normalTest.add(katarzyna);
        normalTest.add(zykfryd);
        normalTest.start();
        System.out.println();

        System.out.println("== Too many people test ==");
        Elevator tooManyPeopleTest = new Elevator();
        tooManyPeopleTest.add(adam);
        tooManyPeopleTest.add(alex);
        tooManyPeopleTest.add(katarzyna);
        tooManyPeopleTest.add(hubert);
        tooManyPeopleTest.add(zykfryd);
        tooManyPeopleTest.add(antoni);
        normalTest.start();
        System.out.println();
    }
}
