package com.d_d.praktyki.magicgame.elements;

import com.d_d.praktyki.magicgame.graphics.Displayable;

public class Text implements Displayable {

    private String content;

    private int[] position = new int[2];

    public Text(String content, int positionX, int positionY) {
        this.content = content;
        position[0] = positionX;
        position[1] = positionY;
    }

    @Override
    public void onDraw(char[][] frame) {
        int content_i = 0;
        for (int i = position[0]; content_i < content.length(); i++, content_i++) {
            frame[position[1]][i] = content.toCharArray()[content_i];
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
