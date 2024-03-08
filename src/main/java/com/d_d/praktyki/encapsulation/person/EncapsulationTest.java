package com.d_d.praktyki.encapsulation.person;

public class EncapsulationTest {
    public static void main(String[] args) {
        Person adam = new Person("Adam", "Kowalski", 21);
        Person niewiadomski = new Person(null, "Niewiadomski", 300);
        Person janina = new Person("Janina", null, 31);
        Person zastrzezony = new Person(null, null, 0);

        adam.greet();
        niewiadomski.greet();
        janina.greet();
        zastrzezony.greet();
    }
}
