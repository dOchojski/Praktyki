package com.d_d.praktyki.courses;

public class BootcampCourse extends OnlineCourse{
    private String instructorName;
    private int consultationHours;

    public BootcampCourse(String courseId, double price, String name, String description, int videoMinutes, int estimatedStudyTime,
                          String instructorName, int consultationHours) {
        super(courseId, price, name, description, videoMinutes, estimatedStudyTime);
        this.instructorName = instructorName;
        this.consultationHours = consultationHours;
    }

    // Getters and setters

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(int consultationHours) {
        this.consultationHours = consultationHours;
    }
}
