package com.d_d.praktyki.SecondWeekSecondYear.Classes;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", 25);
        Person person2 = new Person("Mariusz");

        System.out.println("Pierwsza osoba:\n"+ "Imie: " + person1.getName() + "\nWiek: " + person1.getAge());
        System.out.println("\nDruga osoba:\n"+ "Imie: " + person2.getName() + "\nWiek: " + person2.getAge());
    }
}
