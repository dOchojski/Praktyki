package com.d_d.praktyki.SecondWeekSecondYear.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Miśka");
        Dog dog = new Dog("Rex");

        animal.makeSound();
        dog.makeSound();
    }
}
