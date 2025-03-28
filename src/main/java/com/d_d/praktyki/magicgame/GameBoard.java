package com.d_d.praktyki.magicgame;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GameBoard {
    private Ingredient[][] board;
    private int rows;
    private int cols;

    public GameBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new Ingredient[rows][cols];
        initializeBoard();
    }
    private void initializeBoard() {
        Random random = new Random();
        List<String> ingredientsList = Arrays.asList("Składnik1", "Składnik2", "Składnik3");
        Collections.shuffle(ingredientsList);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = createIngredient(ingredientsList.get(random.nextInt(ingredientsList.size())));
            }
        }
    }
    private Ingredient createIngredient(String name) {
        switch (name) {
            case "Składnik1":
                return new Ingredient1();
            case "Składnik2":
                return new Ingredient2();
            case "Składnik3":
                return new Ingredient3();
            default:
                return null;
        }
    }
    public boolean moveAndCollect(Player player, int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            System.out.println("Niepoprawny ruch. Spróbuj ponownie.");
            return false;
        }

        Ingredient ingredient = board[row][col];
        if (ingredient != null) {
            System.out.println(player.getName() + " zebrano " + ingredient.getName());
            board[row][col] = null;
            player.decrementMoves();
            return true;
        } else {
            System.out.println("Nie znaleziono tutaj więcej składników. Spróbuj ponownie.");
            return false;
        }
    }
    public void displayBoard() {
        System.out.println("Obecna gra planszowa:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Ingredient ingredient = board[i][j];
                if (ingredient != null) {
                    System.out.print(ingredient.getName() + "\t");
                } else {
                    System.out.print("Pusto\t");
                }
            }
            System.out.println();
        }
    }
}
