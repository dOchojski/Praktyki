package com.d_d.praktyki.pointapplication;

public class PointController {
    public void moveLeft(Point point) {
        point.setX(point.getX() - 1);
    }

    public void moveRight(Point point) {
        point.setX(point.getX() + 1);
    }

    public void moveUp(Point point) {
        point.setY(point.getY() + 1);
    }

    public void moveDown(Point point) {
        point.setY(point.getY() - 1);
    }
}
