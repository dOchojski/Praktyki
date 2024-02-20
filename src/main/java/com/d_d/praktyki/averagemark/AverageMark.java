package com.d_d.praktyki.averagemark;

import java.util.Scanner;
import java.util.Vector;

public class AverageMark {
    private static Scanner reader = new Scanner(System.in);
    private Vector<Integer> marks = new Vector<>();

    /**
     * Reads marks from standard input stream.
     * @param n the number of marks to be read.
     */
    public void readMarks(int n) {
        for (int i=0; i<n; i++)
            marks.add(reader.nextInt());
    }

    public void showMarks() {
        marks.forEach(mark -> {
            System.out.println(mark);
        });
    }

    /**
     * Calculate average of marks.
     * @return average of input marks.
     */
    public double calculate() {
        var sum = marks.stream().mapToInt(Integer::valueOf).sum();
        var count = marks.stream().count();
        return sum / count;
    }
}
