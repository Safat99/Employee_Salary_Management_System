package com.safatTechnoNext.model;

import java.util.Date;

public class Employee {

    private long id;
    private Integer pin;
    private String userName;
    private String email;
    private Integer designation_id;
    private String address;
    private Sex gender;
    private String contactNoSelf;
    private String guardianName;
    private String contactNameGuardian;
    private String nid;
    private Date joiningDate;

    public Employee() {
    }

    public Employee(long id, Integer pin, String userName, String email, Integer designation_id, String address, Sex gender, String contactNoSelf, String guardianName, String contactNameGuardian, String nid, Date joiningDate) {

        this.id = id;
        this.pin = pin;
        this.userName = userName;
        this.email = email;
        this.designation_id = designation_id;
        this.address = address;
        this.gender = gender;
        this.contactNoSelf = contactNoSelf;
        this.guardianName = guardianName;
        this.contactNameGuardian = contactNameGuardian;
        this.nid = nid;
        this.joiningDate = joiningDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDesignation_id() {
        return designation_id;
    }

    public void setDesignation_id(Integer designation_id) {
        this.designation_id = designation_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getContactNoSelf() {
        return contactNoSelf;
    }

    public void setContactNoSelf(String contactNoSelf) {
        this.contactNoSelf = contactNoSelf;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getContactNameGuardian() {
        return contactNameGuardian;
    }

    public void setContactNameGuardian(String contactNameGuardian) {
        this.contactNameGuardian = contactNameGuardian;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", pin=" + pin +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", designation_id=" + designation_id +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", contactNoSelf='" + contactNoSelf + '\'' +
                ", guardianName='" + guardianName + '\'' +
                ", contactNameGuardian='" + contactNameGuardian + '\'' +
                ", nid='" + nid + '\'' +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
