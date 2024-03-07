package com.d_d.praktyki.magicgame.elements;

import com.d_d.praktyki.magicgame.graphics.Displayable;

public class Line implements Displayable {

    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    };

    private Orientation orientation;
    private int position;
    private int length;

    public Line(Orientation orientation, int position, int length) {
        this.orientation = orientation;
        this.position = position;
        this.length = length;
    }

    @Override
    public void onDraw(char[][] frame) {
        switch (orientation) {
            case HORIZONTAL -> {
                frame[position] = "=".repeat(length).toCharArray();
            }
            case VERTICAL -> {
                for (int y = 0; y < length; y++) {
                    frame[y][position] = '|';
                }
            }
        }
    }
}
