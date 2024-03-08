package com.d_d.praktyki.encapsulation.person;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public void greet() {
        String text = "Witaj ";
        if (name == null && surname == null)
            text += "nieznajomy";
        else if (name != null && surname != null)
            text += name+" "+surname;
        else if (surname == null)
            text += name;
        else // only surname
            text += "panx "+surname;

        System.out.println(text);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
