package com.codeclan.example.martianhabmanager;

import java.util.ArrayList;

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
        int hunger = (getResourcesRequired() * (4 - getHealth()));
        int consumedFlesh = 0;
        ArrayList<Animal> devoured = new ArrayList<>();

            for (Animal animal : animalModule.getAnimalPopulation()) {
                if (animal.getClass() == Herbivore.class) {
                    hunger -= animal.getResourcesRequired();
                    consumedFlesh += animal.getResourcesRequired();
                    devoured.add(animal);
                }
            }

        animalModule.getAnimalPopulation().removeAll(devoured);
        setHealth(getHealth() + (consumedFlesh / getResourcesRequired()));
    }


}
