package com.d_d.praktyki.FirstWeek.Employees;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Igor", "Kowal", 500));
        employees.add(new Employee("Adrian", "Wiśniewski", 1000));
        employees.add(new Employee("Mateusz", "Józefowski", 1200));



        final double[] Sallary = employees.stream()
                .filter(employee -> {

                    if(employee.getSalary() > 500){
                        System.out.println(employee.getFirstName() + " "  +employee.getLastName() + " - przekracza próg");
                    }else {
                        System.out.println(employee.getFirstName() + " "  +employee.getLastName() + " - nie przekracza próg");
                    }
                    return employee.getSalary() > 500;
                })
                .mapToDouble(Employee::getSalary)
                .toArray();
    }
}