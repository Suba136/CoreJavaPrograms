package com.suba.assignment.utilities;

import com.suba.assignment.employees.Employee;

/**
 * Utility class for Employee operations.
 */
public class EmployeeUtilities {

    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: $" + emp.getSalary());
    }

    public static void raiseSalary(Employee emp, double percent) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percent / 100);
        emp.setSalary(newSalary);
    }
}
