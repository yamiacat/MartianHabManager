package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 29/05/2017.
 */

public class Crop {
    private CropSpecies species;
    private int quantity;
    private int growthRate;


    public Crop(CropSpecies species, int quantity) {
        this.species = species;
        this.quantity = quantity;
        this.growthRate = species.getSpeciesGrowthRate();
    }

    public String getSpecies() {
        return species.getSpeciesDescription();
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void grow() {
        this.quantity += ((this.quantity * this.growthRate) / 100);
    }

    public int getGrownSize() {
        int returnSize = this.quantity;
        returnSize += ((this.quantity * this.growthRate) / 100);
        return returnSize;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
