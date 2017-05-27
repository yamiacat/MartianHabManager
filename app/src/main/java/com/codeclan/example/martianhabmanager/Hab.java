package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 27/05/2017.
 */

public class Hab {

    private String habName;
    private int size;

    public Hab(String habName, int size) {
        this.habName = habName;
        this.size = size;
    }


    public String getHabName() {
        return this.habName;
    }

    public int getHabSize() {
        return size;
    }
}
