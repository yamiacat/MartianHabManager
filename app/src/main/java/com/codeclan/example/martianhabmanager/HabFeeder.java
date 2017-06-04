package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 04/06/2017.
 */

public class HabFeeder {





    public String reportTotalHunger(Hab hab) {
        String hungerReport = "Carnivore requirement = ";
        int carnivoreHunger = 0;
        int herbivoreHunger = 0;

        for (Animal animal : hab.getAnimalModule().getAnimalPopulation()) {
            if (animal.getClass() == Herbivore.class) {
                herbivoreHunger += animal.getSpaceRequired();
            }
            else if (animal.getClass() == Carnivore.class) {
                carnivoreHunger += animal.getSpaceRequired();
            }
        }
        hungerReport += carnivoreHunger + ", Herbivore requirement = " + herbivoreHunger + ".";
        return hungerReport;
    }


    public void feedAnimals(FoodStore foodStore, Hab hab) {
        for (Animal animal : hab.getAnimalModule().getAnimalPopulation()) {
            if ((animal.getClass() == Herbivore.class) &&
                    (animal.getSpaceRequired() <= foodStore.getVeg())) {
                animal.getFed();
                foodStore.eatVeg(animal.getSpaceRequired());
            }
            else if ((animal.getClass() == Herbivore.class) &&
                    (animal.getSpaceRequired() > foodStore.getVeg())) {
                animal.feedSelf(hab);
            }
            else if ((animal.getClass() == Carnivore.class) &&
                    (animal.getSpaceRequired() <= foodStore.getMeat())) {
                animal.getFed();
                foodStore.eatMeat(animal.getSpaceRequired());
            }
            else if ((animal.getClass() == Carnivore.class) &&
                    (animal.getSpaceRequired() > foodStore.getMeat())) {
                animal.feedSelf(hab);
            }
        }
    }
}
