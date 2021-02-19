package com.hackit.website.models;

public class Participant {

    private int age;
    private String name;
    private String phone;

    public Participant(int age, String name, String phone) {
        this.age = age;
        this.name = name;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
