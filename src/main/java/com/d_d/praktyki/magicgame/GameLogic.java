package com.d_d.praktyki.magicgame;

import com.d_d.praktyki.magicgame.elements.Dot;
import com.d_d.praktyki.magicgame.elements.DotController;
import com.d_d.praktyki.magicgame.elements.Ingredient;
import com.d_d.praktyki.magicgame.graphics.Display;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
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

    private DotController controller;

    private static Random random = new Random();

    private Display gameDisplay;

    private int round = 0;

    public GameLogic(Display gameDisplay, DotController controller) {
        this.gameDisplay = gameDisplay;
        this.controller = controller;
    }

    public void onUpdate() {
        onIngredientUpdate();
    }

    private void onIngredientUpdate() {
        // todo rare case scenario: items overlap each other and you can't just take first one
        // todo another scenario: player is on item already, this shall not happen!
        Optional<Ingredient> foundIngredient = ingredients.stream()
                .filter(ingredient -> {
                    int[] characterPosition = controller.getDot().getPosition();
                    int[] ingredientPosition = ingredient.getPosition();
                    return characterPosition[0] == ingredientPosition[0]
                            && characterPosition[1] == ingredientPosition[1];
                }).findFirst();

        if (foundIngredient.isPresent()) {
            System.out.println("Item picked up!");
        }
    }

    public void startRound() {
        Dot previousDot = controller.getDot();
        for (int i = 0; i < Math.log1p(3*round)+1; i++) {
            Ingredient ingredient = createIngredient();
            ingredients.add(ingredient);
            gameDisplay.objects.add(ingredient);

            System.out.println(getDistance(previousDot, ingredient));
            previousDot = ingredient;
        }
    }

    private Ingredient createIngredient() {
        // randomly put ingredients and count distance between them
        int randX = random.nextInt(gameDisplay.getTotalWidth());
        int randY = random.nextInt(gameDisplay.getTotalHeight());
        Ingredient randomIngredient = allIngredients.get(
                random.nextInt(allIngredients.size()));
        randomIngredient.setPosition(new int[]{randX, randY});

        return randomIngredient;
    }

    public void endRound() {
        ingredients.clear();
        round++;
    }

    public static int getDistance(Dot a, Dot b) {
        int[] positionA = a.getPosition();
        int[] positionB = b.getPosition();
        int distance = Math.abs(positionA[0]-positionB[0])
                + Math.abs(positionA[1]-positionB[1]);

        return distance;
    }
}
