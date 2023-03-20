package com.safatTechnoNext.model;

public class Designation {
    private Long id;
    private String designation_name;
    private Double salary;



    public Designation(Long id, String designation_name, Double salary) {
        this.id = id;
        this.designation_name = designation_name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation_name() {
        return designation_name;
    }

    public void setDesignation_name(String designation_name) {
        this.designation_name = designation_name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
