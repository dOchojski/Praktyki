package com.d_d.praktyki.arrayex;

public class ArrayExercise {
    public static void sumArr(int[] array, int[] array2){
        int summ = 0;
        for(int i = 0;i<array.length;i++){
            summ += array[i];
            System.out.println(array[i]);
        }
        for(int i = 0;i<array2.length;i++){
            summ += array2[i];
            System.out.println(array2[i]);
        }
        System.out.println(summ);
    }
    public static void main(String[] args) {
        int[] arr = {11,22,33};
        int[] arr2 = {4,56,78};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            System.out.println(arr[i]);
        }
        for(int i = 0;i<arr2.length;i++){
            sum += arr2[i];
            System.out.println(arr2[i]);
        }
        System.out.println(sum);


        sumArr(arr, arr2);
    }
}
