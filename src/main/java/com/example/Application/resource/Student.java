package com.example.Application.resource;

public class Student {

    private String name;
    private int id;
    private String registrationNumber;

    public  Student() {

    }
    public Student(String name, int id, String registrationNumber) {
        this.name = name;
        this.id = id;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
