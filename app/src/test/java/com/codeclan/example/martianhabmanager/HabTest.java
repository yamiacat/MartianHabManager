package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HabTest {


    @Test
    public void habHasName() {
        Hab hab = new Hab("Capricorn One", 100);
        assertEquals("Capricorn One", hab.getHabName());
    }


    @Test
    public void habHasSize() {
        Hab hab = new Hab("Capricorn One", 100);
        assertEquals(100, hab.getHabSize());
    }

    @Test
    public void habStructuralStrengthSetAutomatically() {
        Hab hab = new Hab("Capricorn One", 100);
        assertEquals(10, hab.getStructuralStrength());
    }

    @Test
    public void habSize20Minimum() {
        Hab hab = new Hab("Capricorn Nought", 10);
        assertEquals(20, hab.getHabSize());
    }

    @Test
    public void habSize100Maximum() {
        Hab hab = new Hab("Capricorn Twelvety", 200);
        assertEquals(100, hab.getHabSize());
    }

    @Test
    public void canGetUnusedSpace() {
        Hab hab = new Hab("Capricorn One", 100);
        ArrayList<Animal> animalBatch = new ArrayList<>();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Herbivore herbivore1 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.RED_DWARF);
        animalBatch.add(carnivore);
        animalBatch.add(herbivore1);
        animalBatch.add(herbivore2);
        hab.houseAnimals(animalBatch);

        assertEquals(93, hab.remainingSpace());
    }

}