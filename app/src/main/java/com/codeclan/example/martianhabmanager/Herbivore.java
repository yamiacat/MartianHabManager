package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 03/06/2017.
 */

public class Herbivore extends Animal {

    private final AnimalSpecies species;

    public Herbivore(AnimalSpecies species) {
        super(species);
        this.species = species;
    }
}
