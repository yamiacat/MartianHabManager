package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 27/05/2017.
 */

public enum AnimalSpecies {
    RED_DWARF("Red Dwarf", 1),
    MARTIAN_LOP("Martian Lop", 2),
    ARESDOGE("Ares Doge", 4);

    private final String speciesDescription;
    private final int speciesSpaceRequired;

    private AnimalSpecies(String description, int spaceRequired) {
        this.speciesDescription = description;
        this.speciesSpaceRequired = spaceRequired;

    }

    public String getSpeciesDescription() {
        return this.speciesDescription;
    }

    public int getSpeciesSpaceRequired() {
        return this.speciesSpaceRequired;
    }

}
