package com.suba.assignment.employees;

/**
 * Manager subclass of Employee.
 */
public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int size) {
        this.teamSize = size;
    }
}
