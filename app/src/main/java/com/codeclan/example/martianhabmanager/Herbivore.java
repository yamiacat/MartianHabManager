package com.codeclan.example.martianhabmanager;

import java.util.ArrayList;

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

    public void goHungry(Hab hab) {
        if (3 == getHealth()) {
            setHealth(getHealth()-1);
        }
        else if (2 == getHealth() && hab.getCropModule().getTotalQuantity() >= this.getResourcesRequired()) {
                feedSelf(hab.getCropModule());
            }
        else if (2 == getHealth() && hab.getCropModule().getTotalQuantity() < this.getResourcesRequired()) {
            setHealth(getHealth()-1);
        }
        else if (1 == getHealth() && hab.getCropModule().getTotalQuantity() >= this.getResourcesRequired()) {
            feedSelf(hab.getCropModule());
        }
        else if (1 == getHealth() && hab.getCropModule().getTotalQuantity() < this.getResourcesRequired()) {
            setHealth(getHealth()-1);
        }
    }

    private void feedSelf(CropModule crops) {
        int hunger = (getResourcesRequired() * (4 - getHealth()));
        ArrayList<Crop> devoured = new ArrayList<>();

        while (hunger > 0) {
            for (Crop crop : crops.getCropsGrowing()) {
                if (crop.getQuantity() > hunger) {
                    crop.setQuantity(crop.getQuantity() - hunger);
                    hunger = 0;
                    setHealth(3);
                }
                else {
                    hunger -= crop.getQuantity();
                    devoured.add(crop);
                    setHealth(getHealth()+1);
                }
            }
        }
        crops.getCropsGrowing().removeAll(devoured);
    }


}
