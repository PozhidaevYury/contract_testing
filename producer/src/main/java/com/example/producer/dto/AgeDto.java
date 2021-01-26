package com.example.producer.dto;

public class AgeDto {

    private final int age;
    private final String sex;

    public AgeDto(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
