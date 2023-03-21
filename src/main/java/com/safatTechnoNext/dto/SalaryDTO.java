package com.safatTechnoNext.dto;

public class SalaryDTO {

    private Integer employeeId;
    private String userName;
    private String designation;
    private Long totalPresentDays;
    private Integer monthlySalary;

    private Long monthlyAllocatedSalary;



    public SalaryDTO(Integer emp_id, String userName, String designationName, Long totalPresentDays, Integer monthlySalary, Long allocatedSalary) {
        this.employeeId = emp_id;
        this.userName = userName;
        this.designation = designationName;
        this.totalPresentDays = totalPresentDays;
        this.monthlySalary = monthlySalary;
        this.monthlyAllocatedSalary = allocatedSalary;
    }

    public SalaryDTO() {}

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Long getTotalPresentDays() {
        return totalPresentDays;
    }

    public void setTotalPresentDays(Long totalPresentDays) {
        this.totalPresentDays = totalPresentDays;
    }

    public Integer getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Integer monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Long getMonthlyAllocatedSalary() {
        return monthlyAllocatedSalary;
    }

    public void setMonthlyAllocatedSalary(Long monthlyAllocatedSalary) {
        this.monthlyAllocatedSalary = monthlyAllocatedSalary;
    }
}
