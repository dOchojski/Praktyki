package com.d_d.praktyki.magicgame.graphics;

import com.d_d.praktyki.magicgame.elements.Dot;
import com.d_d.praktyki.magicgame.elements.Line;

import java.util.ArrayList;

public class BorderedDisplay extends Display {
    ArrayList<Displayable> border = new ArrayList<>();

    public BorderedDisplay(int width, int height) {
        super(width, height);

        // add border around frame
        border.add(new Line(Line.Orientation.HORIZONTAL, 0, width));
        border.add(new Line(Line.Orientation.HORIZONTAL, height-1, width));
        border.add(new Line(Line.Orientation.VERTICAL, 0, height));
        border.add(new Line(Line.Orientation.VERTICAL, width-1, height));

        // add corners
        border.add(new Dot('.', 0, 0, 0));
        border.add(new Dot('.', 0, width-1, 0));
        border.add(new Dot('.', 0, 0, height-1));
        border.add(new Dot('.', 0, width-1, height-1));

        fillWithEmpty();
        objects.addAll(border);
    }

    @Override
    public void clear() {
        // clear everything and add border again
        objects.clear();
        fillWithEmpty();
        objects.addAll(border);
    }
}
