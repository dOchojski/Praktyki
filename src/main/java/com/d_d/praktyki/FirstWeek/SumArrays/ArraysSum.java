package com.d_d.praktyki.SumArrays;

public class ArraysSum {
    public static void main(String[] args){

        int[] a ={72, 8,-5};
        int[] b ={4,-24,9};

        int suma = sum(a,b);
        System.out.println("Suma tablic a i b:" + suma);
    }

    private static int sum(int[] a, int[] b){
        int suma =0;
        for(int i=0;i<3;i++){
            suma += a[i] + b[i];
        }
        return suma;
    }
}
