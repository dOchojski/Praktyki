package com.d_d.praktyki.userinfo;

public class User {
    private String name;
    private Integer age;
    public User(String name, Integer age) {
        this.age = age;
        this.name = name;
    }
    public void printUserInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        User user = new User("Adam", 30);
        user.printUserInfo();
    }
}
