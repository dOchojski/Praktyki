package com.d_d.praktyki.GradeAvg;

import java.util.Scanner;
import java.util.Vector;
public class AverageMark {
    Scanner reader = new Scanner(System.in);
     Vector<Integer> marks = new Vector<>();


    public void showMarks(){
        marks.forEach(System.out::println);
    }
    public void readMarks(int n){
        for(int i=1;i<=n;i++){
            marks.add(reader.nextInt());
        }
    }

    public float calculate() {
        var suma = marks.stream().mapToInt(Integer::valueOf).sum();
        var ilosc = marks.stream().count();
        return (float) suma /ilosc;
    }
}
