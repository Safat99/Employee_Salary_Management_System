package com.safatTechnoNext.dto;

public class EmployeeNumberDTO {
    private String designationName;
    private String gender;
    private Integer countGender;

    public EmployeeNumberDTO() {
    }

    public EmployeeNumberDTO(String designationName, String gender, Integer countGender) {
        this.designationName = designationName;
        this.gender = gender;
        this.countGender = countGender;
    }

    public String getDesignationName() {
        return designationName;
    }

    public String getGender() {
        return gender;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCountGender(Integer countGender) {
        this.countGender = countGender;
    }

    public Integer getCountGender() {
        return countGender;
    }
}
