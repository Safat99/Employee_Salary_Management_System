package com.safatTechnoNext.dto;

public class SalaryDTO {

    private Long emp_id;
    private String userName;
    private String designationName;
    private Integer totalPresentDays;
    private Integer monthlySalary;

    private Integer allocatedSalary;

    public SalaryDTO(Long emp_id, String userName, String designationName, Integer totalPresentDays, Integer monthlySalary, Integer allocatedSalary) {
        this.emp_id = emp_id;
        this.userName = userName;
        this.designationName = designationName;
        this.totalPresentDays = totalPresentDays;
        this.monthlySalary = monthlySalary;
        this.allocatedSalary = allocatedSalary;
    }

    public SalaryDTO() {}

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    public Integer getTotalPresentDays() {
        return totalPresentDays;
    }

    public void setTotalPresentDays(Integer totalPresentDays) {
        this.totalPresentDays = totalPresentDays;
    }

    public Integer getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Integer monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Integer getAllocatedSalary() {
        return allocatedSalary;
    }

    public void setAllocatedSalary(Integer allocatedSalary) {
        this.allocatedSalary = allocatedSalary;
    }
}
