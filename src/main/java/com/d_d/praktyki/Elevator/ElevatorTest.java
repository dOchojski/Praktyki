package com.d_d.praktyki.Elevator;

public class ElevatorTest {
    public static void main(String[] args){
        People p1 = new People();
        People p2 = new People();
        People p3 = new People();
        People p4 = new People();
        People p5 = new People();
        People p6 = new People();
        People p7 = new People();

        p1.Person(70);
        p2.Person(90);
        p3.Person(100);
        p4.Person(162);
        p5.Person(67);
        p6.Person(87);
        p7.Person(300);

        Elevator normal = new Elevator();
        Elevator overweight = new Elevator();
        Elevator people = new Elevator();


        System.out.println("_-_Normalne testy_-_");

        normal.add(p1);
        normal.add(p2);
        normal.add(p3);
        normal.add(p5);

        normal.start();
        normal.clean();

        System.out.println("_-_Powyżej wagi testy_-_");

        overweight.add(p7);
        overweight.add(p4);

        overweight.start();
        overweight.clean();

        System.out.println("_-_Osobowe testy windy_-_");

        people.add(p1);
        people.start();

        people.add(p2);
        people.start();

        people.add(p3);
        people.start();

        people.add(p5);
        people.add(p4);

        people.start();
        people.clean();





    }
}
