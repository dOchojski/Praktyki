package com.d_d.praktyki.debbuging.user;

public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void printUserInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        User user = null;
        user.printUserInfo();
    }
}
