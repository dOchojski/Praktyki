package com.d_d.praktyki.ThirdWeek.Hurtownia;

// Part.java
class Part {
    private String partNumber;
    private String manufacturerName;
    private String model;
    private String series;

    public Part(String partNumber, String manufacturerName, String model, String series) {
        this.partNumber = partNumber;
        this.manufacturerName = manufacturerName;
        this.model = model;
        this.series = series;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
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
        return "Cżęść{" +
                "Numer częśći='" + partNumber + '\'' +
                ", Nazwa Producenta='" + manufacturerName + '\'' +
                ", model='" + model + '\'' +
                ", seria='" + series + '\'' + '}';
    }
}

// Tire.java
class Tire extends Part {
    private int size;
    private int width;

    public Tire(String partNumber, String manufacturerName, String model, String series,
                int size, int width) {
        super(partNumber, manufacturerName, model, series);
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
                "Numer cżęśći='" + getPartNumber() + '\'' +
                ", Nazwa producenta='" + getManufacturerName() + '\'' +
                ", model='" + getModel() + '\'' +
                ", seria='" + getSeries() + '\'' +
                ", rozmiar=" + size +
                ", szerokość=" + width + '}';
    }
}

// ExhaustPart.java
class ExhaustPart extends Part {
    private boolean europeanEmissionStandard;

    public ExhaustPart(String partNumber, String manufacturerName, String model, String series,
                       boolean europeanEmissionStandard) {
        super(partNumber, manufacturerName, model, series);
        this.europeanEmissionStandard = europeanEmissionStandard;
    }

    public boolean isEuropeanEmissionStandard() {
        return europeanEmissionStandard;
    }

    public void setEuropeanEmissionStandard(boolean europeanEmissionStandard) {
        this.europeanEmissionStandard = europeanEmissionStandard;
    }

    @Override
    public String toString() {
        return "Układ wydechowy{" +
                "Numer częśći hurtowni='" + getPartNumber() + '\'' +
                ", Nazwa producenta='" + getManufacturerName() + '\'' +
                ", model='" + getModel() + '\'' +
                ", seria='" + getSeries() + '\'' +
                ", Czy spotyka Europejski standard emisyjny>=" + europeanEmissionStandard + '}';
    }
}
