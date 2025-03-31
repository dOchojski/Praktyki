package com.d_d.praktyki.SecondWeekSecondYear.Inheritance;

public class Animal {
    protected String name;

    Animal(String name){
        this.name=name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

}

class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " says: Woof");
    }
}
