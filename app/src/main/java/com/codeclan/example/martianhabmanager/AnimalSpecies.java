package com.codeclan.example.martianhabmanager;

public enum AnimalSpecies {
    RED_DWARF("Red Dwarf", 1, 1),
    MARTIAN_LOP("Martian Lop", 2, 2),
    ARESDOGE("Ares Doge", 4, 3);

    private final String speciesDescription;
    private final int speciesResourcesRequired;
    private final int speciesLongevity;

    private AnimalSpecies(String description, int resourcesRequired, int speciesLongevity) {
        this.speciesDescription = description;
        this.speciesResourcesRequired = resourcesRequired;
        this.speciesLongevity = speciesLongevity;
    }

    public String getSpeciesDescription() {
        return this.speciesDescription;
    }

    public int getSpeciesResourcesRequired() {
        return this.speciesResourcesRequired;
    }

    public int getSpeciesLongevity() {
        return this.speciesLongevity;
    }

}
