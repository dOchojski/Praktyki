package com.d_d.praktyki.arrays.elevator;

public class Person {
    private final String name;
    private final int weight;
    private final int index;
    private static int auto_increment_index = 0;
    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.index = auto_increment_index;
        auto_increment_index++;
    }
    public int getWeight() { return weight; }
}
