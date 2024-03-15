package com.d_d.praktyki.Elevator;

public class People {

    private int id;
    private int weight;
    private static int auto_increment = 1;
    public void Person(int weight){
        this.weight = weight;
        id = auto_increment;
        auto_increment++;
    }
    public int getWeight(){
        return weight;
    }
}
