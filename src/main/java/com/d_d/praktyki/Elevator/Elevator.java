package com.d_d.praktyki.Elevator;

public class Elevator {
    private final int max_amount = 4;//Maksymalna ilośc osób
    private final int max_weight = 400;
    private final People[] people = new People[max_amount];
    private int count = 0;

    public void add(People id){
        if(count<max_amount){
            people[count] = id;
            count++;
        }else{
            System.out.println("W windzie nie ma miejsca.");
        }
    }
    public void start(){
        int weight = 0;
        for(int i=0; i<count;i++){
            weight+=people[i].getWeight();
        }
        if(weight>max_weight){
            int diffrence= weight-max_weight;
            System.out.println("Przekroczono maksymalną wagę o " +  diffrence);
        }else{
            System.out.println("Winda wystartowała");
        }
    }

    public void clean(){
        count=0;
        System.out.println("Winda jest pusta");
    }
}
