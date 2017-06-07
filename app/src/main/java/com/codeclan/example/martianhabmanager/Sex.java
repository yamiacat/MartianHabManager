package com.codeclan.example.martianhabmanager;

public enum Sex {
    FEMALE("female"),
    MALE("male");


    private final String sexDescription;

    private Sex(String description) {
        this.sexDescription = description;
    }

    public String getSexDescription() {
        return this.sexDescription;
    }
}
