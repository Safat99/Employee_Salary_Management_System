package com.safatTechnoNext.model;

public class Designation {
    private Long id;
    private String designation_name;
    private Integer salary;


    public Designation() {
    }

    public Designation(Long id, String designation_name, Integer salary) {
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
