package com.d_d.praktyki.arrays.elevator;

public class Elevator {
    private final int max_people_amount;
    private final int weightOverload;
    private final Person[] people;
    private int people_count = 0;
    public Elevator() { this(4, 400); }
    public Elevator(int max_people, int max_weight) {
        max_people_amount = max_people;
        people = new Person[max_people_amount];
        weightOverload = max_weight;
    }
    public void add(Person person) {
        if (people_count >= 4) {
            System.out.println("Too many people, there is no space! Max.: "+max_people_amount);
            return;
        }
        people[people_count] = person;
        people_count++;
    }
    public void start() {
        int totalWeight = 0;
        for (int i=0; i<people_count; i++) {
            totalWeight += people[i].getWeight();
        }
        if (totalWeight >= weightOverload) {
            System.out.println(
                "Elevator is overloaded! Total weight: "+totalWeight+" kg"
                +", allowed: "+weightOverload
            );
            return;
        }
        System.out.println("Elevator going up!");
    }
}
