package com.microservices.department_service.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private Long id;

    private String name;

    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Department(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
