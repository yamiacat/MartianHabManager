package com.codeclan.example.martianhabmanager;

public class Carnivore extends Animal {


    private final AnimalSpecies species;
    private int health;

    public Carnivore(AnimalSpecies species) {
        super(species);
        this.species = species;
        this.health = getHealth();
    }


    public void getFed() {
        if (this.health < 3) {
            this.health += 1;
        }
    }

    public void feedSelf(Hab hab) {

    }

}
