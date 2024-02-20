package com.d_d.praktyki.conditionalstatements;

public class Dot implements Displayable {
    protected int[] position = new int[2];
    private int baseSpeed;
    public Dot() {
        baseSpeed = 1;
        position[0] = 0;
        position[1] = 0;
    }
    @Override
    public void onDraw(char frame[][]) {
        frame[position[1]][position[0]] = '@';
    }
    public int getSpeed() {
        return baseSpeed;
    }
}
