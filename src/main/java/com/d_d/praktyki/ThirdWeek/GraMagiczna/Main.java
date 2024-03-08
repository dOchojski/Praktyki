package com.d_d.praktyki.ThirdWeek.GraMagiczna;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);


        char[][] arr = new char[11][11];
        for (int i = 0; i < 11; i++) {
            arr[i] = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
        }

        int y=10,x=10;


        System.out.println("Podaj ilość przedmiotów do znalezienia.");
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            int x2 = rand.nextInt(11);
            int y2 = rand.nextInt(11);
            arr[y2][x2] = 'X';
        }
            arr[y][x] = 'T';
            int moves = 0;
            for (int i = 0; i < 11; i++) {
                System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " " +
                        arr[i][3] + " " + arr[i][4] + " " + arr[i][5] + " " + arr[i][6] + " " +
                        arr[i][7] + " " + arr[i][8] + " " + arr[i][9] + " " + arr[i][10]);
            }


            System.out.println("X= Surowce\nT= Twoja postać\n 0= Puste pola");
            while (true) {
                amount= MagicGame.check(arr,11,11);

                if(amount==0){
                    System.out.println("Zdobyłeś wszystkie surowce.");
                    break;
                }else{}

                System.out.println("Musisz zebrać aż " + amount +" surowców. \nPodaj kierunek ruchu\n1-Lewo\n" +
                        "2-Góra\n5-Dół\n6-Prawo\n0-Zobacz liczbę korków które zrobiłeś");

                char choice = scanner.next().charAt(0);
                if (choice == '1' && x != 0) {
                    arr[y][x] = '0';
                    x = MagicGame.left(x);
                    arr[y][x] = 'T';
                } else if (choice == '2' && y != 0) {
                    arr[y][x] = '0';
                    y = MagicGame.up(y);
                    arr[y][x] = 'T';
                } else if (choice == '5' && y != 10) {
                    arr[y][x] = '0';
                    y = MagicGame.down(y);
                    arr[y][x] = 'T';
                } else if (choice == '6' && x != 10) {
                    arr[y][x] = '0';
                    x = MagicGame.right(x);
                    arr[y][x] = 'T';
                }else if(choice=='0'){
                    MagicGame.showMoves(moves);
                }
                moves++;
                for (int i = 0; i < 11; i++) {
                    System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " " +
                            arr[i][3] + " " + arr[i][4] + " " + arr[i][5] + " " + arr[i][6] + " " +
                            arr[i][7] + " " + arr[i][8] + " " + arr[i][9] + " " + arr[i][10]);
                }


            }
        }
    }
