package com.d_d.praktyki.evennumbers;

public class EvenNumbers {
    public int isEven(int[] numbers){
        int evenCount = 0;
        for (int i = 0; i < numbers.length;i++) {
            System.out.println(numbers[i]);
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}
