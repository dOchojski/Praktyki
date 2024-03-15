package com.d_d.praktyki.courses;

public class Course {
    private String courseId;
    private double price;
    private String name;
    private String description;

    public Course(String courseId, double price, String name, String description) {
        this.courseId = courseId;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
