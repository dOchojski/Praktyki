package com.d_d.praktyki.ex2;

import java.util.ArrayList;
import java.util.List;
public class EmployeeStreamExample {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 50000.0));
        employees.add(new Manager("Jane Smith", 70000.0, "IT"));
        employees.add(new Employee("Bob Johnson", 60000.0));
        employees.add(new Manager("Alice Brown", 80000.0, "HR"));

        double filterSalary = 60000.0;

        System.out.println("Pracownicy z wynagrodzeniem większym niż " + filterSalary + ":");
        employees.stream()
                .filter(e -> e.getSalary() > filterSalary)
                .forEach(EmployeeStreamExample::displayEmployeeInfo);

        System.out.println("\nMapowane wynagrodzenia pracowników:");
        List<Double> salaries = employees.stream()
                .map(Employee::getSalary)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        salaries.forEach(salary -> System.out.println("Wynagrodzenie: " + salary));
    }

    private static void displayEmployeeInfo(Employee employee) {
        System.out.println("Informacje o pracowniku: " + employee);
    }
}
