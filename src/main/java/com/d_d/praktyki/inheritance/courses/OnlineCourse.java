package com.d_d.praktyki.inheritance.courses;

public class OnlineCourse extends Course {
    private double videoLength;
    private double courseLength;

    public OnlineCourse(String id, String name, String description,
                        double price, double videoLength, double courseLength) {
        super(id, name, description, price);
        this.videoLength = videoLength;
        this.courseLength = courseLength;
    }

    public double getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(double videoLength) {
        this.videoLength = videoLength;
    }

    public double getCourseLength() {
        return courseLength;
    }

    public void setCourseLength(double courseLength) {
        this.courseLength = courseLength;
    }
}
