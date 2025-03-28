package com.d_d.praktyki.averagemark;

public class AverageMark {

    public float calcAvg(int[] marks){
        int x = 0;
        for (int i = 0 ; i < marks.length ; i++){
            x += marks[i];
            //System.out.println(marks[i]);
        }
        return x / marks.length;
    }
}