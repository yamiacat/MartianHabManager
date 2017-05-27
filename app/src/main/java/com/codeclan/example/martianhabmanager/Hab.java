package com.codeclan.example.martianhabmanager;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 27/05/2017.
 */

public class Hab {

    private String habName;
    private int size;
    private ArrayList<Animal> animalPopulation;

    public Hab(String habName, int size) {
        this.habName = habName;
        this.size = size;
        this.animalPopulation = new ArrayList<Animal>();
    }


    public String getHabName() {
        return this.habName;
    }

    public int getHabSize() {
        return size;
    }

    // NEED TO RETURN ERROR OR WARNING IF TOO FULL?
    public void acceptAnimal(Animal animal) {
        if (this.remainingSpace() >= animal.getSpaceRequired()) {
            this.animalPopulation.add(animal);
        }
    }

    public int animalCount() {
        return this.animalPopulation.size();
    }

    public int remainingSpace() {
        int remainingSpace = this.size;
        for (Animal animal : animalPopulation) {
            remainingSpace -= animal.getSpaceRequired();
        }
        return remainingSpace;
    }

    public ArrayList<Animal> removeSpecies(String speciesDescription) {
        ArrayList<Animal> soughtAnimals = new ArrayList<Animal>();

        for (Animal animal : this.animalPopulation) {
            if (animal.getSpecies().equals(speciesDescription)) {
                soughtAnimals.add(animal);
            }
        }

        this.animalPopulation.removeAll(soughtAnimals);
        return soughtAnimals;
    }
}
