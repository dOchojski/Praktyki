package com.d_d.praktyki.inheritance.courses;

public class BootcampCourse extends OnlineCourse {
    private String Lecturer;
    private int consultations;

    public BootcampCourse(String id, String name, String description, double price,
                          double videoLength, double courseLength, String lecturer, int consultations) {
        super(id, name, description, price, videoLength, courseLength);
        Lecturer = lecturer;
        this.consultations = consultations;
    }

    public String getLecturer() {
        return Lecturer;
    }

    public void setLecturer(String lecturer) {
        Lecturer = lecturer;
    }

    public int getConsultations() {
        return consultations;
    }

    public void setConsultations(int consultations) {
        this.consultations = consultations;
    }
}
