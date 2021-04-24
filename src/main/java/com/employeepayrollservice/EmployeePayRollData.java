package com.employeepayrollservice;

public class EmployeePayRollData {
    private int id;
    private String name;
    private Double salary;

    public EmployeePayRollData(int id, String name, Double salary) {
        setId(id);
        setName(name);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
