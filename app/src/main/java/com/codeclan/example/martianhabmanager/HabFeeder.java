package com.codeclan.example.martianhabmanager;


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
                animal.feedSelf(hab);
            }
            else if ((animal.getClass() == Carnivore.class) &&
                    (animal.getResourcesRequired() <= foodStore.getMeat())) {
                animal.getFed();
                foodStore.eatMeat(animal.getResourcesRequired());
            }
            else if ((animal.getClass() == Carnivore.class) &&
                    (animal.getResourcesRequired() > foodStore.getMeat())) {
                animal.feedSelf(hab);
            }
        }
    }
}
