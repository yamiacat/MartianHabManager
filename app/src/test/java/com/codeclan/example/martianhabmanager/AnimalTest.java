package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class AnimalTest {

    @Test
    public void animalHasSpecies() {
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        assertEquals("Ares Doge", animal.getSpecies());
    }

    @Test
    public void animalHasDefaultName() {
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        assertEquals("Specimen 000-Hexagon", animal.getAnimalName());
    }

    @Test
    public void animalNameCanBeSet() {
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        animal.setAnimalName("Fluffkins");
        assertEquals("Fluffkins", animal.getAnimalName());
    }

    @Test
    public void canGetAnimalSpaceRequired() {
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        assertEquals(4, animal.getSpaceRequired());
    }

    @Test
    public void animalsStartWithThreeHealth() {
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        assertEquals(3, animal.getHealth());
    }

    @Test
    public void animalsStartWithHealthyStatus() {
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        assertEquals("healthy", animal.getHealthStatus());
    }

}