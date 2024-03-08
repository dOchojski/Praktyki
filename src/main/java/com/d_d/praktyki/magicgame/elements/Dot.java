package com.d_d.praktyki.magicgame.elements;

import com.d_d.praktyki.magicgame.graphics.Displayable;

public class Dot implements Displayable {
    protected int[] position = new int[2];
    private int baseSpeed;

    private char symbol;

    public Dot() {
        this('@', 1, 0, 0);
    }

    public Dot(char symbol) {
        this(symbol, 1, 0, 0);
    }

    public Dot(char symbol, int baseSpeed, int positionX, int positionY) {
        this.baseSpeed = baseSpeed;
        position[0] = positionX;
        position[1] = positionY;
        this.symbol = symbol;
    }

    @Override
    public void onDraw(char frame[][]) {
        frame[position[1]][position[0]] = symbol;
    }

    public int getSpeed() {
        return baseSpeed;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }
}
