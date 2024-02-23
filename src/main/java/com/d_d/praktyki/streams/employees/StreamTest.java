package com.d_d.praktyki.streams.employees;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Adam", "Mickiewicz", 40.4));
        employees.add(new Employee("Juliusz", "Słowacki", 1000));
        employees.add(new Employee("Henryk", "Sienkiewicz", 1200));

        
    }
}
