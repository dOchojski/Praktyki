package com.d_d.praktyki.MultidimensionalArray;

public class MultidimensionalArray {
    public static void main(String[] args){
        double[][] arr = new double[3][3];
         arr[0] = new double[]{1.0, 1.5, 2.0};
         arr[1] = new double[]{1.5, 2.0, 2.5};
         arr[2] = new double[]{2.0, 2.5, 3.0};


        double diagonalMultSum = 0.00;
        double multi1=1.00;
        double multi2=1.00;

        for (int i=0;i<arr.length;i++){
            multi1 = multi1 * arr[i][i];
            multi2 = multi2 * arr[i][arr.length-1-i];
        }
        diagonalMultSum=multi1+multi2;

        System.out.println("Suma iloczynów przekątnych tablicy: " + diagonalMultSum);

        double middleRowCol = 0.00;
        double row =0.00,col=0.00;
        for(int i=0;i<arr.length;i++){
            col+=arr[i][1];
            row+=arr[1][i];
        }
        middleRowCol=col*row;

        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny: "+ middleRowCol);

        double SumaEdge = 0.00;
        for(int i=0;i<arr.length-1;i++){
            SumaEdge+=arr[0][i];
            SumaEdge+=arr[i][0];
            SumaEdge+=arr[2][i];
            SumaEdge+=arr[i][2];
        }

        SumaEdge+=arr[0][arr.length-1];

        System.out.println("Suma elementów przy krawędzi: "+ SumaEdge);
    }
}
