package com.d_d.praktyki.ThirdWeek.GraMagiczna;

public class MagicGame {


    public static int left(int x) {
        return x-1;
    }

    public static int up(int y) {
        return y - 1;
    }

    public static int down(int y) {
        return y + 1;
    }

    public static int right(int x) {
        return x + 1;
    }

    public static int check(char[][] arr, int i1, int j1){
        int number=0;
        for(int i=0;i<i1;i++){
            for(int j=0;j<j1;j++){
                if(arr[j][i]=='X'){
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