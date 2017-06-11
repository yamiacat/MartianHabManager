package com.codeclan.example.martianhabmanager;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class HabBreeder {

    public int reportViablePairs(Hab hab) {
        ArrayList<Animal> viableFemales = new ArrayList<>();

        for (Animal animal : hab.getAnimalModule().getAnimalPopulation()) {
            if (animal.getSex().getSexDescription().equals("female") &&
                    animal.getMaturity().equals("mature")) {
                viableFemales.add(animal);
            }
        }
        int viablePairTotal = 0;
        for (Animal female : viableFemales) {
            for (Animal animal : hab.getAnimalModule().getAnimalPopulation()) {
                if (animal.getSex().getSexDescription().equals("male") &&
                        animal.getSpecies().equals(female.getSpecies()) &&
                            animal.getMaturity().equals("mature")) {
                    viablePairTotal ++;
                }
            }
        }

    return viablePairTotal;
    }
}
