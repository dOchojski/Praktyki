package com.d_d.praktyki.averagemark;

public class AverageMarkTest {
    public static void main(String[] args) {
        AverageMark averageMark = new AverageMark();
        float avg = averageMark.calcAvg(new int[]{5, 2, 3, 4});
        System.out.println("Średnia wynosi: " + avg);
    }
}
