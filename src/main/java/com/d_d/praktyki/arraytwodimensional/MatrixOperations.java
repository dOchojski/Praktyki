package com.d_d.praktyki.arraytwodimensional;

public class MatrixOperations {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.0, 1.5, 2.0},
                {1.5, 2.0, 2.5},
                {2.0, 2.5, 3.0}
        };

        double diagonalProductSum = calculateDiagonalProductSum(matrix);
        System.out.println("Suma iloczynów przekątnych: " + diagonalProductSum);

        double middleRowSum = calculateRowSum(matrix, 1);
        double middleColumnSum = calculateColumnSum(matrix, 1);
        double middleRowColumnProduct = middleRowSum * middleColumnSum;
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny: " + middleRowColumnProduct);

        double edgeSum = calculateEdgeSum(matrix);
        System.out.println("Suma wszystkich elementów znajdujących się przy krawędzi: " + edgeSum);
    }

    private static double calculateDiagonalProductSum(double[][] matrix) {
        double sum = 0.0;
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            sum += matrix[i][i] * matrix[i][size - 1 - i];
        }

        return sum;
    }

    private static double calculateRowSum(double[][] matrix, int rowIndex) {
        double sum = 0.0;
        int columns = matrix[0].length;

        for (int j = 0; j < columns; j++) {
            sum += matrix[rowIndex][j];
        }

        return sum;
    }

    private static double calculateColumnSum(double[][] matrix, int columnIndex) {
        double sum = 0.0;
        int rows = matrix.length;

        for (int i = 0; i < rows; i++) {
            sum += matrix[i][columnIndex];
        }

        return sum;
    }

    private static double calculateEdgeSum(double[][] matrix) {
        double sum = 0.0;
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
}
