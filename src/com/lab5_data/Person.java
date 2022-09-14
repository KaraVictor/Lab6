package com.lab5_data;

public class Person {
    private final String name;
    private final Long height;
    private final Country nationality;

    // class constructor

    public Person(String name, Long height, Country  nationality) {
        this.name = name;
        this.height = height;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public Long getHeight() {
        return height;
    }

    public Country getNationality() {
        return nationality;
    }
}
