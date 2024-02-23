package com.d_d.praktyki.FirstWeek.Employees;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public double getSalary() { return salary; }
}