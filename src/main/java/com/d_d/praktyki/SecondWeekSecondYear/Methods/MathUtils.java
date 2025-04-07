package com.d_d.praktyki.SecondWeekSecondYear.Methods;

public class MathUtils {

    public static double add(double num1, double num2){
        return num1+num2;
    }
    public static double add(int num1, double num2){
        return num1+num2;
    }
    public static double add(double num1, int num2){
        return num1+num2;
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }

    public static boolean isEven(int number){
        return number%2==0;
    }

    public static int[] findMinMax(int[] numbers){
        int max = numbers[0], min = numbers[0];
        int maxid=0,minid=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        int[] minmax = {min,max};
        return minmax;
    }
}
