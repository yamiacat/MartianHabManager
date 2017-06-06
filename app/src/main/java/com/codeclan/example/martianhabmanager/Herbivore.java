package com.codeclan.example.martianhabmanager;

public class Herbivore extends Animal {

    private final AnimalSpecies species;


    public Herbivore(AnimalSpecies species) {
        super(species);
        this.species = species;

    }




    public void getFed() {
        if (getHealth() < 3) {
            setHealth(getHealth() + 1);
        }
    }

    //TODO!
    public void feedSelf(Hab hab) {
        if (3 == getHealth()) {
            setHealth(getHealth()-1);
        }
        else if (2 == getHealth()) {
            setHealth(getHealth()-1);
        }


//        if (hab.getCropModule().getTotalQuantity() >= this.getResourcesRequired()) {
//        }
    }


}
