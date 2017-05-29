package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 29/05/2017.
 */

public class Crop {
    private CropSpecies species;
    private int quantity;


    public Crop(CropSpecies species, int quantity) {
        this.species = species;
        this.quantity = quantity;

    }

    public String getSpecies() {
        return species.getSpeciesDescription();
    }

    public int getQuantity() {
        return this.quantity;
    }
}
