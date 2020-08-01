package com.test;

import java.util.Objects;

public class Emp {
    private int empId;
    private String name;
    private double salary;

    public Emp() {
    }

    public Emp(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equal called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        if (empId != emp.empId) return false;
        return name != null ? name.equals(emp.name) : emp.name == null;
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode is called");
        int result = empId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}


