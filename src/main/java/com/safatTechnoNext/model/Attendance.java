package com.safatTechnoNext.model;

import java.util.Date;

public class Attendance {
    private Long id;
    private Date date;
    private boolean is_present;
    private Employee employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIs_present() {
        return is_present;
    }

    public void setIs_present(boolean is_present) {
        this.is_present = is_present;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Attendance() {
    }

    public Attendance(Long id, Date date, boolean is_present, Employee employee) {
        this.id = id;
        this.date = date;
        this.is_present = is_present;
        this.employee = employee;
    }
}
