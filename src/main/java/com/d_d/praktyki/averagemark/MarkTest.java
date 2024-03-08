package com.d_d.praktyki.averagemark;

public class MarkTest {
    public static void main(String[] args) {
        AverageMark avg = new AverageMark();
        avg.readMarks(5);
        avg.showMarks();
        System.out.println(avg.calculate());
    }
}
