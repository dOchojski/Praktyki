package com.d_d.praktyki.NumberEven;

public class EvenNumbers {
    public int countEven(int[] numbers){
        int count=0;
        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
            if(numbers[i] % 2 ==0){
                count++;
                System.out.println("Ta liczba jest parzysta");
            }
        }
        return count;
    }
}
