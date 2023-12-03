package Exercices.case_study.model.person;

import java.util.Date;

public  abstract class Person {
    private  int CMND,phoneNumber;
    private  String name,sex,email, id;
    private String dateOfBirth;

    public Person() {
    }

    public Person(int CMND, int phoneNumber, String name, String sex, String email, String id, String dateOfBirth) {
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return name +
                "CMND= " + CMND +
                ", phoneNumber= " + phoneNumber +
                ", sex= " + sex  +
                ", email= " + email + '\'' +
                ", id= " + id + '\'' +
                ", dateOfBirth= " + dateOfBirth;
    }
}
