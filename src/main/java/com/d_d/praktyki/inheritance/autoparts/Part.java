package com.d_d.praktyki.inheritance.autoparts;

public class Part {
    private String uid;
    private String manufacturer;
    private String model;

    public Part(String uid, String manufacturer, String model, String series) {
        this.uid = uid;
        this.manufacturer = manufacturer;
        this.model = model;
        this.series = series;
    }

    public void showInformation(boolean newline) {
        System.out.printf("UID %s, manufacturer %s, model %s", uid, manufacturer, model);
        if (newline) System.out.println();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    private String series;
}
