package com.d_d.praktyki.magicgame.elements;

public class Ingredient extends Dot {
    private char symbol;
    private String name;

    public Ingredient(char symbol, String name) {
        this(symbol, name, 0, 0);
    }

    public Ingredient(char symbol, String name, int positionX, int positionY) {
        position[0] = positionX;
        position[1] = positionY;
        this.symbol = symbol;
        this.name = name;
    }

    @Override
    public void onDraw(char[][] frame) {
        frame[position[1]][position[0]] = symbol;
    }
}
