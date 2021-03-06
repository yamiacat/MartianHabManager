package com.codeclan.example.martianhabmanager;


import java.util.ArrayList;

public class HabFeeder {



    public String reportTotalHunger(Hab hab) {
        String hungerReport = "Carnivore requirement = ";
        int carnivoreHunger = 0;
        int herbivoreHunger = 0;

        for (Animal animal : hab.getAnimalModule().getAnimalPopulation()) {
            if (animal.getClass() == Herbivore.class) {
                herbivoreHunger += animal.getResourcesRequired();
            }
            else if (animal.getClass() == Carnivore.class) {
                carnivoreHunger += animal.getResourcesRequired();
            }
        }
        hungerReport += carnivoreHunger + ", Herbivore requirement = " + herbivoreHunger + ".";
        return hungerReport;
    }


    public void feedAnimals(FoodStore foodStore, Hab hab) {
        for (Animal animal : hab.getAnimalModule().getAnimalPopulation()) {
            if ((animal.getClass() == Herbivore.class) &&
                    (animal.getResourcesRequired() <= foodStore.getVeg())) {
                animal.getFed();
                foodStore.eatVeg(animal.getResourcesRequired());
            }
            else if ((animal.getClass() == Herbivore.class) &&
                    (animal.getResourcesRequired() > foodStore.getVeg())) {
                animal.goHungry(hab);
            }
            else if ((animal.getClass() == Carnivore.class) &&
                    (animal.getResourcesRequired() <= foodStore.getMeat())) {
                animal.getFed();
                foodStore.eatMeat(animal.getResourcesRequired());
            }
            else if ((animal.getClass() == Carnivore.class) &&
                    (animal.getResourcesRequired() > foodStore.getMeat())) {
                animal.goHungry(hab);
            }
        }
    }

    public void harvestCorpses(FoodStore foodStore, Hab hab) {
        ArrayList<Animal> deadAnimals = new ArrayList<>();
        for (Animal animal : hab.getAnimalModule().getAnimalPopulation()) {
            if (0 == animal.getHealth()) {
                deadAnimals.add(animal);
                foodStore.addMeat(animal.getResourcesRequired());
            }
        }
    hab.getAnimalModule().getAnimalPopulation().removeAll(deadAnimals);
    }
}
