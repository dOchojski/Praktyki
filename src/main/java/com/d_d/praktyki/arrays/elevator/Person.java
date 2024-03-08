package com.d_d.praktyki.arrays.elevator;

public class Person {
    private String name;
    private int weight;
    private int index;
    private static int autoIncrementIndex = 0;
    public Person() {}
    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.index = autoIncrementIndex;
        autoIncrementIndex++;
    }
    public int getWeight() { return weight; }
}
