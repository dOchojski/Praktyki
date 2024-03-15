package com.d_d.praktyki.NumberEven;

public class EvenNumbersTest {
    public static void main(String[] args){
        int num[]={10,23,55,21,52,16,74,57,106,386,8,34};
        EvenNumbers even = new EvenNumbers();
        System.out.println("Ilość liczb parzystych: "+ even.countEven(num));
    }
}
