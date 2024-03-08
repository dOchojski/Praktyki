package com.d_d.praktyki.inheritance.autoparts;

public class Tire extends Part {
    private double diameter;
    private double width;

    public Tire(String uid, String manufacturer, String model, String series, double diameter, double width) {
        super(uid, manufacturer, model, series);
        this.diameter = diameter;
        this.width = width;
    }

    @Override
    public void showInformation(boolean newline) {
        super.showInformation(false);
        System.out.printf(", diameter %f, width %f", diameter, width);
        if (newline) System.out.println();
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
