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
        if (3 == getHealth()) {
            setHealth(getHealth()-1);
        }
        else if (2 <= getHealth() && hab.getAnimalModule().herbivoreFleshAmount() > 0) {
            feedSelf(hab.getAnimalModule());
        }
        else if (2 >= getHealth() && 0 == hab.getAnimalModule().herbivoreFleshAmount()) {
            setHealth(getHealth()-1);
        }
    }

    private void feedSelf(AnimalModule animalModule) {
    }

}
