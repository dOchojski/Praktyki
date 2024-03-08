package com.d_d.praktyki.magicgame.elements;

public class DotController {
    private Dot dot;
    public DotController(Dot dot) {
        this.dot = dot;
    }
    public void handleInput(String input) {
        char key = input.charAt(0);
        if (key == 'w') dot.position[1] -= 1 * dot.getSpeed();
        if (key == 'd') dot.position[0] += 1 * dot.getSpeed();
        if (key == 's') dot.position[1] += 1 * dot.getSpeed();
        if (key == 'a') dot.position[0] -= 1 * dot.getSpeed();
    }

    public Dot getDot() {
        return dot;
    }

    public void setDot(Dot dot) {
        this.dot = dot;
    }
}
