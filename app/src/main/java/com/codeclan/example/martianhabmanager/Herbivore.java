package com.codeclan.example.martianhabmanager;

public class Herbivore extends Animal {

    private final AnimalSpecies species;

    private int health;

    public Herbivore(AnimalSpecies species) {
        super(species);
        this.species = species;
        this.health = getHealth();
    }

    public void getFed() {
        if (this.health < 3) {
            this.health += 1;
        }
    }

    //TODO!
    public void feedSelf(Hab hab) {
        if (hab.getCropModule().getTotalQuantity() >= this.getSpaceRequired()) {
        }
    }

}
