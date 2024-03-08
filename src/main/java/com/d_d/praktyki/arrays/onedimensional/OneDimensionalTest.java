package com.d_d.praktyki.arrays.onedimensional;

public class OneDimensionalTest {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {6,-2,7};
        int sum = sum(a, b);
        System.out.print("Suma wszystkich liczb obu metod: "+sum);
    }

    private static int sum(int[] a, int[] b) {
        int sum = 0;
        for (int i=0; i<3; i++)
            // reduce all values to one sum
            sum += a[i]+b[i];
        return sum;
    }
}
