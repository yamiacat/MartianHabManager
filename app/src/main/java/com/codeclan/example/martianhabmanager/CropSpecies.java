package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 29/05/2017.
 */

public enum CropSpecies {
    PHOBOSHROOMS("Phoboshrooms", 10),
    WHITE_FLUFF("White Fluff", 7),
    RED_ALGAE("Red Algae", 4),
    DEIMOS_LETTUCE("Deimos Lettuce", 2);


    private final String speciesDescription;
    private final int speciesGrowthRate;

    private CropSpecies(String description, int growthRate) {
        this.speciesDescription = description;
        this.speciesGrowthRate = growthRate;

    }

    public String getSpeciesDescription() {
        return this.speciesDescription;
    }

    public int getSpeciesGrowthRate() {
        return this.speciesGrowthRate;
    }

}

