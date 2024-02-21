package com.d_d.praktyki.evennumbers;

public class EvenNumbersTest {
    public static void main(String[] args) {
        EvenNumbers evenNumbers = new EvenNumbers();
        int evenCount = evenNumbers.isEven(new int[]{5,6,4,7,1,2,87,34});
        System.out.println("Liczba liczb parzystych: " + evenCount);
    }
}
