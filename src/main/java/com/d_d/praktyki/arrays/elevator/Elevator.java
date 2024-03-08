package com.d_d.praktyki.arrays.elevator;

public class Elevator {
    private final int maxPeopleAmount;
    private final int weightOverload;
    private final Person[] people;
    private int peopleCount = 0;
    public Elevator() { this(4, 400); }
    public Elevator(int maxPeople, int maxWeight) {
        maxPeopleAmount = maxPeople;
        people = new Person[maxPeopleAmount];
        weightOverload = maxWeight;
    }
    public void add(Person person) {
        if (peopleCount >= 4) {
            System.out.println("Too many people, there is no space! Max.: "+ maxPeopleAmount);
            return;
        }
        people[peopleCount] = person;
        peopleCount++;
    }
    public void start() {
        int totalWeight = 0;
        for (int i = 0; i< peopleCount; i++) {
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

    public void clear() {
        peopleCount = 0;
        System.out.println("Elevator is empty.");
    }
}
