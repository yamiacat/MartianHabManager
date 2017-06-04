package com.codeclan.example.martianhabmanager;

import java.util.ArrayList;

/**
 * Created by user on 02/06/2017.
 */

public class AnimalModule {

    private ArrayList<Animal> animalPopulation;


    public AnimalModule() {
        this.animalPopulation = new ArrayList<>();
    }

    public int animalCount() {
        return this.animalPopulation.size();
    }

    public ArrayList<Animal> getAnimalPopulation() {
        return this.animalPopulation;
    }

    public int getTotalSpace() {
        int totalSpace = 0;
        for (Animal animal : this.animalPopulation) {
            totalSpace += animal.getSpaceRequired();
        }
        return totalSpace;
    }


    public void acceptAnimalBatch(ArrayList<Animal> batch, int remainingSize) {
        for (Animal animal : batch) {
            if (remainingSize >= animal.getSpaceRequired()) {
                this.animalPopulation.add(animal);
                remainingSize -= animal.getSpaceRequired();
            }
        }

    }

    public ArrayList<Animal> removeSpecies(String speciesDescription) {
        ArrayList<Animal> soughtAnimals = new ArrayList<>();

        for (Animal animal : this.animalPopulation) {
            if (animal.getSpecies().equals(speciesDescription)) {
                soughtAnimals.add(animal);
            }
        }
        this.animalPopulation.removeAll(soughtAnimals);
        return soughtAnimals;
    }



}
