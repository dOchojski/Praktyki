package com.d_d.praktyki.magicgame.graphics;

import com.d_d.praktyki.magicgame.elements.Dot;
import com.d_d.praktyki.magicgame.elements.Line;

public class BorderedDisplay extends Display {
    public BorderedDisplay(int width, int height) {
        super(width, height);

        // add border around frame
        objects.add(new Line(Line.Orientation.HORIZONTAL, 0, width));
        objects.add(new Line(Line.Orientation.HORIZONTAL, height-1, width));
        objects.add(new Line(Line.Orientation.VERTICAL, 0, height));
        objects.add(new Line(Line.Orientation.VERTICAL, width-1, height));

        // add corners
        objects.add(new Dot('.', 0, 0, 0));
        objects.add(new Dot('.', 0, width-1, 0));
        objects.add(new Dot('.', 0, 0, height-1));
        objects.add(new Dot('.', 0, width-1, height-1));
    }
}
