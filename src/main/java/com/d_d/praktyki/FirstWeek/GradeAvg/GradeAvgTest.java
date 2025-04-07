package com.d_d.praktyki.GradeAvg;

public class GradeAvgTest {
    public static void main(String[] args) {

        AverageMark nr1 = new AverageMark();

        nr1.readMarks(5);
        nr1.showMarks();
        System.out.println(nr1.calculate());
    }
}
