package com.d_d.praktyki.inheritance.courses;

public class CoursesTest {
    public static void main(String[] args) {
        OnlineCourse cppCourse = new OnlineCourse("CPP-ZELENT",
                "C++ Course and how to make timer only for Windows :P",
                "This course will allow to make only platform-dependent (Windows) timer in " +
                        "old WinApi Builder",
                1000,
                45,
                60
        );
        BootcampCourse bootstrapCourse = new BootcampCourse("BOOTSTRAP-1125125124",
                "Bootstrap Bootcamp Course",
                "Bootstrap Bootcamp Course about Bootstrap",
                12.25,
                30,
                50,
                "Adam Nowak",
                3
        );
    }
}
