package com.d_d.praktyki.courses;

public class StationaryCourse extends Course{
    private String location;
    private int numberOfSessions;

    public StationaryCourse(String courseId, double price, String name, String description, String location, int numberOfSessions) {
        super(courseId, price, name, description);
        this.location = location;
        this.numberOfSessions = numberOfSessions;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfSessions() {
        return numberOfSessions;
    }

    public void setNumberOfSessions(int numberOfSessions) {
        this.numberOfSessions = numberOfSessions;
    }
}