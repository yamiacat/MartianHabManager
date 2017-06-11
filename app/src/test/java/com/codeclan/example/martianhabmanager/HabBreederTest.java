package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class HabBreederTest {

    @Test
    public void habBreederDetectsBreedingPairs() {
        HabBreeder habBreeder = new HabBreeder();
        Hab hab = new Hab("Capricorn One", 100);
        ArrayList<Animal> animalBatch = new ArrayList<>();
        Herbivore herbivore1 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        herbivore2.setSex(Sex.MALE);
        herbivore1.setAge(15);
        herbivore2.setAge(15);
        animalBatch.add(herbivore1);
        animalBatch.add(herbivore2);
        hab.houseAnimals(animalBatch);

        assertEquals(1, habBreeder.reportViablePairs(hab));
    }

    @Test
    public void habBreederDetectsBreedingPairsNotHardcoded() {
        HabBreeder habBreeder = new HabBreeder();
        Hab hab = new Hab("Capricorn One", 100);
        ArrayList<Animal> animalBatch = new ArrayList<>();
        Herbivore herbivore1 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        herbivore1.setAge(15);
        herbivore2.setAge(15);
        animalBatch.add(herbivore1);
        animalBatch.add(herbivore2);
        hab.houseAnimals(animalBatch);

        assertEquals(0, habBreeder.reportViablePairs(hab));
    }




}
