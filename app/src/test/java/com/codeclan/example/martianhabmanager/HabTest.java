package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
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
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.MARTIAN_LOP);
        Animal animal3 = new Animal(AnimalSpecies.RED_DWARF);
        animalBatch.add(animal);
        animalBatch.add(animal2);
        animalBatch.add(animal3);
        hab.houseAnimals(animalBatch);

        assertEquals(93, hab.remainingSpace());
    }

}