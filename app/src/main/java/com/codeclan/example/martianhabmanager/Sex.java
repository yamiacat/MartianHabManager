package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 27/05/2017.
 */

public enum Sex {
    FEMALE("Female"),
    MALE("Male");


    private final String sexDescription;

    private Sex(String description) {
        this.sexDescription = description;
    }

    public String getSexDescription() {
        return this.sexDescription;
    }
}
