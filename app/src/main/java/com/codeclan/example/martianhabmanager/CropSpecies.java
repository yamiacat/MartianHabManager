package com.codeclan.example.martianhabmanager;

public enum CropSpecies {
    PHOBOSHROOMS("Phoboshrooms", 100),
    WHITE_FLUFF("White Fluff", 70),
    RED_ALGAE("Red Algae", 40),
    DEIMOS_LETTUCE("Deimos Lettuce", 20);


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

