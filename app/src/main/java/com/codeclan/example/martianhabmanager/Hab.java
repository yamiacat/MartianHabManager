package com.codeclan.example.martianhabmanager;

import java.util.ArrayList;

public class Hab {

    private String habName;
    private int size;
    private int structuralStrength;
    private AnimalModule animalModule;
    private CropModule cropModule;


    public Hab(String habName, int size) {
        this.habName = habName;
        this.size = calculateHabSize(size);
        this.structuralStrength = 110 - this.size;
        this.cropModule = new CropModule();
        this.animalModule = new AnimalModule();


    }

    private int calculateHabSize(int size) {
        int habSize;
        if (size > 100) {
            habSize = 100;
        } else if (size < 20) {
            habSize = 20;
        } else {
            habSize = size;
        }
        return habSize;
    }


    public String getHabName() {
        return this.habName;
    }

    public int getHabSize() {
        return size;
    }



    public int remainingSpace() {
        int remainingSpace = this.size;
        remainingSpace -= this.animalModule.getTotalSpace();
        remainingSpace -= this.cropModule.getTotalQuantity();

        return remainingSpace;
    }



    public int getStructuralStrength() {
        return structuralStrength;
    }


    public void plantCrops(Crop crop) {
        this.cropModule.plantCrop(crop, this.remainingSpace());
    }

    public void houseAnimals(ArrayList<Animal> animals) {
        this.animalModule.acceptAnimalBatch(animals, this.remainingSpace());
    }

    public AnimalModule getAnimalModule() {
        return this.animalModule;
    }

    public CropModule getCropModule() {
        return this.cropModule;
    }
}