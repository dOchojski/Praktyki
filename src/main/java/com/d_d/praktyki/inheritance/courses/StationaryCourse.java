package com.d_d.praktyki.inheritance.courses;

public class StationaryCourse extends Course {
    private String miejscowość;
    private int classes;

    public StationaryCourse(String id, String name, String description,
                            double price, String miejscowość, int classes) {
        super(id, name, description, price);
        this.miejscowość = miejscowość;
        this.classes = classes;
    }

    public String getMiejscowość() {
        return miejscowość;
    }

    public void setMiejscowość(String miejscowość) {
        this.miejscowość = miejscowość;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }
}
