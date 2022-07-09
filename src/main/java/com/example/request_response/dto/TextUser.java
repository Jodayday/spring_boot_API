package com.example.request_response.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextUser {
    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumber;

    public TextUser(){
        this.name= null;
        this.age =0;
        this.phoneNumber = null;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String NamePoneget(){
        return name+phoneNumber;
    }

    public TextUser(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "TextUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
