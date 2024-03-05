package com.d_d.praktyki.dziedziczenie;

public class Part {
    private int partNumber;
    private String manufacturer;
    private String model;
    private String series;

    public Part(int partNumber, String manufacturer, String model, String series) {
        this.partNumber = partNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.series = series;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Część{" +
                "numer identyfikacyjny=" + partNumber +
                ", producent='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", seria='" + series + '\'' +
                '}';
    }
}
