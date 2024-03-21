package org.example.dz_map.sort_employee;

public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return getName().compareTo(employee.name);
    }

    @Override
    public String toString() {
        return name + '-' +salary;
    }
}
