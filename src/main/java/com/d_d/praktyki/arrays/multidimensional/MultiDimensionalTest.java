package com.d_d.praktyki.arrays.multidimensional;

public class MultiDimensionalTest {
    public static void main(String[] args) {
        double[][] arr = new double[3][3];
        arr[0] = new double[]{1.0, 1.5, 2.0};
        arr[1] = new double[]{1.5, 2.5, 2.5};
        arr[2] = new double[]{2.0, 2.5, 3.0};

        double diags = arr[0][0] * arr[1][1] * arr[2][2]
                     + arr[2][0] * arr[1][1] * arr[0][2];
        System.out.println("Suma iloczynów przekątnych tablicy: "+diags);

        double rowColProd = (arr[0][1]+arr[1][1]+arr[2][1])
                            * (arr[1][0]+arr[1][1]+arr[1][2]);
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny: "+rowColProd);

        double edgeSum = arr[0][0]+arr[0][1]+arr[0][2]
                        + arr[1][0]          +arr[1][2]
                        + arr[2][0]+arr[2][1]+arr[2][2];
        System.out.println("Suma wszystkich elementów przy krawędzi: "+edgeSum);
    }
}
