package com.d_d.praktyki.ThirdWeek.GraMagiczna;

import java.util.Scanner;


public class MagicGame {
    static Scanner scanner = new Scanner(System.in);
    private static int y=0;
    private static int x=0;

    public static int left(int x) {
        Left(x);
        return x-1;
    }
    public static void Left(int x1) {
        x=x1-1;
    }
    public static int up(int y) {
        Up(y);
        return y - 1;
    }
    public static void Up(int y1) {
        y=y1-1;
    }
    public static int down(int y) {
        Down(y);
        return y + 1;
    }
    public static void Down(int y1) {
        y=y1+1;
    }
    public static int right(int x) {
        Right(x);
        return x + 1;
    }
    public static void Right(int x1) {
        x=x1+1;
    }

    public static int Moves(){
        int move = scanner.nextInt();
        return move;
    }

    public static int check(char[][] arr, int i1, int j1){
        int number=0;
        for(int i=0;i<i1;i++){
            for(int j=0;j<j1;j++){
                if(arr[j][i]=='X'){
                    number++;
                }else if(arr[j][i]=='A'){
                    number++;
                } else if (arr[j][i]=='V'){
                    number++;
                }
            }
        }
        return number;
    }
    public static void showMoves(int moves){
        System.out.println("Liczba kroków: " + moves);
    }


    
}