package com.codeclan.example.martianhabmanager;

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

    public void acceptAnimal(Animal animal) {
        this.animalPopulation.add(animal);
    }

    public int animalCount() {
        return this.animalPopulation.size();
    }
}
