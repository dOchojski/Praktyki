package com.d_d.praktyki.magicgame;

import com.d_d.praktyki.magicgame.elements.Dot;
import com.d_d.praktyki.magicgame.elements.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GameLogic {
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    private ArrayList<Ingredient> allIngredients = new ArrayList<>(
        Arrays.asList(
                new Ingredient('!', "Stick"),
                new Ingredient('*', "Berry"),
                new Ingredient('$', "Dollah"),
                new Ingredient('&', "Potion"),
                new Ingredient(')', "Bow")
        )
    );

    Random random = new Random();

    private int width;
    private int height;

    private int round = 0;

    public GameLogic(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static int getDistance(Dot a, Dot b) {
        int[] positionA = a.getPosition();
        int[] positionB = b.getPosition();
        int distance = Math.abs(positionA[0]-positionB[0])
                + Math.abs(positionA[1]-positionB[1]);

        return distance;
    }

    public void startRound(Dot character) {
        // randomly put ingredients and count distance between them
        int randX = random.nextInt(width);
        int randY = random.nextInt(height);
        Ingredient randomIngredient = allIngredients.get(
                random.nextInt(allIngredients.size()));
        randomIngredient.setPosition(new int[]{randX, randY});

        System.out.println(getDistance(character, randomIngredient));
    }

    public void endRound() {
        ingredients.clear();
        round++;
    }
}
