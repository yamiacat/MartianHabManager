package com.codeclan.example.martianhabmanager;

import java.util.ArrayList;


public class CropModule {
    private ArrayList<Crop> cropsGrowing;

    public CropModule() {
        this.cropsGrowing = new ArrayList<>();
    }

    public int getTotalQuantity() {
        int totalQuantity = 0;
        for (Crop crop : this.cropsGrowing) {
            totalQuantity += crop.getQuantity();
        }
        return totalQuantity;
    }


    public void plantCrop(Crop crop, int remainingSize) {
        if (crop.getQuantity() > remainingSize) {
            crop.setQuantity(remainingSize);
        }
        if (!speciesAlreadyGrowingCheck(crop)) {
                this.cropsGrowing.add(crop);
            } else {
            mergeCrops(crop);
        }
    }

    private void mergeCrops(Crop newCrop) {
        for (Crop growingCrop : this.cropsGrowing) {
            if (growingCrop.getSpecies().equals(newCrop.getSpecies())) {
                growingCrop.setQuantity(growingCrop.getQuantity() + newCrop.getQuantity());
            }
        }
    }

    private boolean speciesAlreadyGrowingCheck(Crop newCrop) {
        for (Crop growingCrop : this.cropsGrowing) {
            if (growingCrop.getSpecies().equals(newCrop.getSpecies())) {
                    return true;
            }
        }
        return false;
    }

    public int cropSpeciesCount() {
        return this.cropsGrowing.size();
    }
}