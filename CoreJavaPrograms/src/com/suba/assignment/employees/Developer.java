package com.suba.assignment.employees;

/**
 * Developer subclass of Employee.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String id, double salary, String lang) {
        super(name, id, salary);
        this.programmingLanguage = lang;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String lang) {
        this.programmingLanguage = lang;
    }
}
