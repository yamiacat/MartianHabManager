package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 27/05/2017.
 */

public enum Species {
    RED_DWARF("Red Dwarf"),
    MARTIAN_LOP("Martian Lop"),
    ARESDOGE("Ares Doge");

    private final String speciesDescription;

    private Species(String description) {
        this.speciesDescription = description;
    }

    public String getSpeciesDescription() {
        return this.speciesDescription;
    }

}
