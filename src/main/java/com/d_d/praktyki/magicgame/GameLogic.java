package com.d_d.praktyki.magicgame;

import com.d_d.praktyki.magicgame.elements.Dot;
import com.d_d.praktyki.magicgame.elements.DotController;
import com.d_d.praktyki.magicgame.elements.Ingredient;
import com.d_d.praktyki.magicgame.elements.Text;
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
    private Display tasksDisplay;

    private int round = 0;

    private int maxMoves = 0;
    private int currentMoves = 0;

    public GameLogic(Display gameDisplay, Display tasksDisplay, DotController controller) {
        this.gameDisplay = gameDisplay;
        this.tasksDisplay = tasksDisplay;
        this.controller = controller;
    }

    public void onUpdate() {
        while(true) {
            onTasksUpdate();
            onIngredientUpdate();
            if (ingredients.isEmpty()) {
                endRound();
                startRound();
            } else break;
        };
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
            System.out.printf("%s picked up!\n", foundIngredient.get().getName());
            onRemoveIngredient(foundIngredient.get());
        }
    }

    private void onTasksUpdate() {
        tasksDisplay.clear();
        char[] ingredientsToPickUp = new char[ingredients.size()];
        for (int i = 0; i < ingredients.size(); i++) {
            ingredientsToPickUp[i] = ingredients.get(i).getSymbol();
        }

        Text toPickUp = new Text(null, 1, 1);
        String sprites = new String(ingredientsToPickUp);
        toPickUp.setContent("LEFT:".concat(sprites));
        tasksDisplay.objects.add(toPickUp);

        String movesStr = "(%d)".formatted(maxMoves);
        Text moves = new Text(null, tasksDisplay.getTotalWidth()-1-movesStr.length(), 1);
        moves.setContent(movesStr);
        tasksDisplay.objects.add(moves);
    }

    public void startRound() {
        Dot previousDot = controller.getDot();
        int movesSum = 0;
        for (int i = 0; i < Math.log1p(3*round)+1; i++) {
            Ingredient ingredient = createIngredient();
            onAddIngredient(ingredient);

            movesSum += getDistance(previousDot, ingredient);
            previousDot = ingredient;
        }
        maxMoves = movesSum;
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

    private void onAddIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        gameDisplay.objects.add(ingredient);
    }

    private void onRemoveIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
        gameDisplay.objects.remove(ingredient);
    }

    public void endRound() {
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
