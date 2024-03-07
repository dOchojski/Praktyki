package com.d_d.praktyki.magicgame.graphics;

import java.util.Vector;

class Empty implements Displayable {
    private int[] position = new int[2];
    public Empty(int[] position) {
        this.position = position;
    }
    @Override
    public void onDraw(char[][] frame) {
        frame[position[1]][position[0]] = '#';
    }
}

public class Display {
    public Vector<Displayable> objects = new Vector<>();
    private char[][] frame;
    private final int width;
    private final int height;
    public Display(int width, int height) {
        this.width = width;
        this.height = height;
        frame = new char[height][width];
        fillWithEmpty();
    }
    public void displayFrame() {
        // render objects
        objects.forEach(object -> {
            object.onDraw(frame);
        });
        // print out frame
        for(int i=0; i<height; i++) {
            System.out.println(frame[i]);
        }
    }
    private void fillWithEmpty() {
        for(int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                objects.add(new Empty(new int[]{j, i}));
            }
        }
    }

    public int getTotalWidth() {
        return width;
    }

    public int getTotalHeight() {
        return height;
    }
}
