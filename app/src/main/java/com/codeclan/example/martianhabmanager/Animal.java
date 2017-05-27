package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 27/05/2017.
 */

public class Animal {
    private String animalName;
    private Species species;
    private int spaceRequired;
//    private int maxAge;
//    private int age;
//    private String maturity;
//    private int fecundity;
//    private int o2Required;

//    private int nutritionalValue;


    public Animal(Species species) {
        this.species = species;

    }

    public String getSpecies() {
        return this.species.getSpeciesDescription();
    }
}
