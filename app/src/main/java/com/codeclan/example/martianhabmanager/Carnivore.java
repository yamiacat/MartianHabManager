package com.codeclan.example.martianhabmanager;

public class Carnivore extends Animal {


    private final AnimalSpecies species;


    public Carnivore(AnimalSpecies species) {
        super(species);
        this.species = species;

    }




    public void getFed() {
        if (getHealth() < 3) {
            setHealth(getHealth() + 1);
        }
    }
//TODO!
    public void goHungry(Hab hab) {

    }

}
