package com.d_d.praktyki.courses;

public class OnlineCourse extends Course{
    private int videoMinutes;
    private int estimatedStudyTime;

    public OnlineCourse(String courseId, double price, String name, String description, int videoMinutes, int estimatedStudyTime) {
        super(courseId, price, name, description);
        this.videoMinutes = videoMinutes;
        this.estimatedStudyTime = estimatedStudyTime;
    }

    public int getVideoMinutes() {
        return videoMinutes;
    }

    public void setVideoMinutes(int videoMinutes) {
        this.videoMinutes = videoMinutes;
    }

    public int getEstimatedStudyTime() {
        return estimatedStudyTime;
    }

    public void setEstimatedStudyTime(int estimatedStudyTime) {
        this.estimatedStudyTime = estimatedStudyTime;
    }
}

