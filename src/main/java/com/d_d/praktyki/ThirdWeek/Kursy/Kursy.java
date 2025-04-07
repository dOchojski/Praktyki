package com.d_d.praktyki.ThirdWeek.Kursy;

class Kursy {
    private String courseId;
    private double price;
    private String name;
    private String description;

    public Kursy(String courseId, double price, String name, String description) {
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

    @Override
    public String toString() {
        return "Kurs{" +
                "idKursu='" + courseId + '\'' +
                ", cena=" + price +
                ", nazwa='" + name + '\'' +
                ", opis='" + description + '\'' + '}';
    }
}



class OnlineCourse extends Kursy {
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

    @Override
    public String toString() {
        return "KursOnline{" +
                "idKursu='" + getCourseId() + '\'' +
                ", cena=" + getPrice() +
                ", nazwa='" + getName() + '\'' +
                ", opis='" + getDescription() + '\'' +
                ", liczbaMinutWideo=" + getVideoMinutes() +
                ", szacowanyCzasNauki=" + getEstimatedStudyTime() + '}';
    }
}



class StationaryCourse extends Kursy {
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

    @Override
    public String toString() {
        return "KursStacjonarny{" +
                "idKursu='" + getCourseId() + '\'' +
                ", cena=" + getPrice() +
                ", nazwa='" + getName() + '\'' +
                ", opis='" + getDescription() + '\'' +
                ", lokalizacja='" + getLocation() + '\'' +
                ", liczbaZajec=" + getNumberOfSessions() + '}';
    }
}



class Bootcamp extends OnlineCourse {
    private String instructorName;
    private int consultationHours;

    public Bootcamp(String courseId, double price, String name, String description, int videoMinutes, int estimatedStudyTime, String instructorName, int consultationHours) {
        super(courseId, price, name, description, videoMinutes, estimatedStudyTime);
        this.instructorName = instructorName;
        this.consultationHours = consultationHours;
    }

    // Gettery i settery
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

    @Override
    public String toString() {
        return "Bootcamp{" +
                "idKursu='" + getCourseId() + '\'' +
                ", cena=" + getPrice() +
                ", nazwa='" + getName() + '\'' +
                ", opis='" + getDescription() + '\'' +
                ", liczbaMinutWideo=" + getVideoMinutes() +
                ", szacowanyCzasNauki=" + getEstimatedStudyTime() +
                ", imieNazwiskoProwadzacego='" + getInstructorName() + '\'' +
                ", godzinyKonsultacji=" + getConsultationHours() + '}';
    }


}
