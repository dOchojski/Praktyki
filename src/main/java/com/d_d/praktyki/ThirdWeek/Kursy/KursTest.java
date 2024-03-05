package com.d_d.praktyki.ThirdWeek.Kursy;

public class KursTest {
    public static void main(String[] args) {
        OnlineCourse javaOnlineCourse = new OnlineCourse("JAVA-ONLINE-123", 99.99, "Java Programming", "Learn Java programming online", 120, 3000);
        StationaryCourse javaStationaryCourse = new StationaryCourse("JAVA-STACJO-WRO-234", 199.99, "Java Bootcamp", "Intensive Java bootcamp", "Wroclaw", 10);
        Bootcamp pythonBootcamp = new Bootcamp("PYTHON-BOOTCAMP-567", 149.99, "Python Bootcamp", "Intensive Python bootcamp with trainer support", 180, 4000, "Oskar Mann", 6);

        System.out.println(javaOnlineCourse);
        System.out.println(javaStationaryCourse);
        System.out.println(pythonBootcamp);
    }
}
