package org.example.dz_map.sort_employee;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
//        return Double.compare(e1.getSalary(), e2.getSalary());
        int nameCompare = e1.getName().compareTo(e2.getName());
        if (nameCompare == 0) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
        return nameCompare;
    }
}
