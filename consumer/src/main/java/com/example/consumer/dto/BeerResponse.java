package com.example.consumer.dto;


public class BeerResponse {

    private final int age;
    private final boolean beerAllowed;
    private final String sex;

    public BeerResponse(int age, String sex, boolean beerAllowed) {
        this.age = age;
        this.sex = sex;
        this.beerAllowed = beerAllowed;
    }

    public String getSex() {
        return sex;
    }

    public boolean isBeerAllowed() {
        return beerAllowed;
    }

    public int getAge() {
        return age;
    }
}
