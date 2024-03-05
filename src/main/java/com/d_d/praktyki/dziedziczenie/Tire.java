package com.d_d.praktyki.dziedziczenie;

public class Tire extends Part{

    private int size;
    private int width;

    public Tire(int partNumber, String manufacturer, String model, String series, int size, int width) {
        super(partNumber, manufacturer, model, series);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Opona{" +
                "rozmiar=" + size +
                ", szerokość=" + width +
                "} " + super.toString();
    }
}
