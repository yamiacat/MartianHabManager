package com.codeclan.example.martianhabmanager;

import java.util.ArrayList;

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
            totalSpace += animal.getResourcesRequired();
        }
        return totalSpace;
    }


    public void acceptAnimalBatch(ArrayList<Animal> batch, int remainingSize) {
        for (Animal animal : batch) {
            if (remainingSize >= animal.getResourcesRequired()) {
                this.animalPopulation.add(animal);
                remainingSize -= animal.getResourcesRequired();
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


    public int herbivoreFleshAmount() {
        int herbivoreFleshAmount = 0;
        for (Animal animal : this.animalPopulation) {
            if (animal.getClass() == Herbivore.class) {
                herbivoreFleshAmount += animal.getResourcesRequired();
            }
        }
    return herbivoreFleshAmount;
    }
}
