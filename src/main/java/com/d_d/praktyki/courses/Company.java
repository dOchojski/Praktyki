package com.d_d.praktyki.courses;

public class Company {
    public static void main(String[] args) {
        Course onlineCourse = new OnlineCourse("JAVA-ONLINE-123", 199.99, "Java kurs online",
                "Naucz się programować w Javie online", 180, 300);

        Course stationaryCourse = new StationaryCourse("JAVA-STACJO-WRO-234", 299.99, "Java kurs stacjonarny",
                "Szkolenie Java we Wroclawiu", "Wroclaw", 10);

        Course bootcampCourse = new BootcampCourse("JAVA-BOOTCAMP-567", 499.99, "Java Bootcamp",
                "Intensywne nauczanie kodowania Javy z trenerem", 240, 400,
                "Adam Nowak", 20);

        System.out.println("Kurs Online: " + onlineCourse.getDescription());
        System.out.println("Kurs Stacjonarny: " + stationaryCourse.getDescription());
        System.out.println("Kurs Bootcamp: " + bootcampCourse.getDescription());
    }
}
