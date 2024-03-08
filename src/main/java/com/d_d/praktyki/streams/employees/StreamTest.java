package com.d_d.praktyki.streams.employees;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Adam", "Mickiewicz", 40.4));
        employees.add(new Employee("Juliusz", "Słowacki", 1000));
        employees.add(new Employee("Henryk", "Sienkiewicz", 1200));

        final double[] salaryExceeding = employees.stream()
                .filter(employee -> {
                    boolean hasExceedingThreshold = employee.getSalary() > 50;

                    System.out.println(String.format("%s %s - %s",
                            employee.getFirstName(), employee.getLastName(),
                            hasExceedingThreshold ? "przekracza próg" : "nie przekracza progu"));
                    return employee.getSalary() > 40.4;
                })
                .mapToDouble(employee -> employee.getSalary())
                .toArray();

        System.out.println("== Zarobki przekraczające próg ==");
        for (double salary : salaryExceeding) {
            System.out.println(salary);
        }
        System.out.println("==");
    }
}
