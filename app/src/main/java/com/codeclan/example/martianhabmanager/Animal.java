package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 27/05/2017.
 */

public class Animal {
    private FakeDice dice = new FakeDice(1);
    private DefaultNamer namer = new DefaultNamer(dice);
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
        this.animalName = namer.getDefaultName();

    }

    public String getSpecies() {
        return this.species.getSpeciesDescription();
    }

    public String getAnimalName() {
        return this.animalName;
    }
}
