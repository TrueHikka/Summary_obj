package org.example.dz_map.sort_employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 3000);
        Employee e2 = new Employee("Alice", 2000);
        Employee e3 = new Employee("Bob", 2500);
        Employee e4 = new Employee("Charlie", 3500);
        Employee e5 = new Employee("Charlie", 500);
        Employee e6 = new Employee("Charlie", 700);

        //List sort
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        System.out.println(employees);

        Collections.sort(employees);
        System.out.println("Sorted by name: " + employees);

        Collections.sort(employees, new EmployeeSalaryComparator());
        System.out.println("Sorted by salary: " + employees);

        //TreeSet sort
        TreeSet<Employee> treeSet = new TreeSet<>();
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        System.out.println("TreeSet sorted by name: " + treeSet);

        TreeSet<Employee> treeSetWithComparator = new TreeSet<>(new EmployeeSalaryComparator());
        treeSetWithComparator.add(e1);
        treeSetWithComparator.add(e2);
        treeSetWithComparator.add(e3);
        treeSetWithComparator.add(e4);
        treeSetWithComparator.add(e5);
        treeSetWithComparator.add(e6);
        System.out.println("TreeSet sorted by salary: " +  treeSetWithComparator);
    }
}
