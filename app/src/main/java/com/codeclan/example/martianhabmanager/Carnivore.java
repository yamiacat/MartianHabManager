package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 03/06/2017.
 */

public class Carnivore extends Animal {


    private final AnimalSpecies species;

    public Carnivore(AnimalSpecies species) {
        super(species);
        this.species = species;
    }
}
