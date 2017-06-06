package com.codeclan.example.martianhabmanager;

public enum AnimalSpecies {
    RED_DWARF("Red Dwarf", 1),
    MARTIAN_LOP("Martian Lop", 2),
    ARESDOGE("Ares Doge", 4);

    private final String speciesDescription;
    private final int speciesResourcesRequired;

    private AnimalSpecies(String description, int resourcesRequired) {
        this.speciesDescription = description;
        this.speciesResourcesRequired = resourcesRequired;

    }

    public String getSpeciesDescription() {
        return this.speciesDescription;
    }

    public int getSpeciesResourcesRequired() {
        return this.speciesResourcesRequired;
    }

}
