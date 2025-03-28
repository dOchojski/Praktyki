package com.d_d.praktyki.blokcheme;

import java.util.Scanner;

public class AlgorythmTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int multi = 1;
        int next = 0;

        next = scanner.nextInt();

        while (index < 5){
            multi = multi * next;
            index++;
        }
        if(multi >= 0){
            System.out.println("Nieujemna");
        }
        else{
            System.out.println("Ujemna");
        }
    }
}
