package com.d_d.praktyki.SecondWeekSecondYear.Methods;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dodawanie double: " + MathUtils.add(20.2,21.9));
        System.out.println("Dodawanie int: " + MathUtils.add(39, 92));
        System.out.println("Dodawanie double i int: " + MathUtils.add(1.2,57));
        System.out.println("Dodawanie int i double: " + MathUtils.add(81,21.9));
        int num=23;
        if(MathUtils.isEven(num)) {
            System.out.println("Liczba "+ num + " jest parzysta");
        }else{
            System.out.println("Liczba "+ num + " jest nieparzysta");
        }

        int[] numbers = {25,72,8,1,78,23,43,90};
        int[] min_and_max = MathUtils.findMinMax(numbers);
        System.out.println("Najmniejsza liczba w tablicy: " + min_and_max[0] + "\nNajwiększa liczba w tablicy: " + min_and_max[1]);
    }
}
