package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class AnimalTest {

    @Test
    public void animalHasSpecies() {
        Animal animal = new Animal(Species.ARESDOGE);
        assertEquals("Ares Doge", animal.getSpecies());
    }

    @Test
    public void animalHasDefaultName() {
        Animal animal = new Animal(Species.ARESDOGE);
        assertEquals("Specimen 000-Hexagon", animal.getAnimalName());
    }

    @Test
    public void animalNameCanBeSet() {
        Animal animal = new Animal(Species.ARESDOGE);
        animal.setAnimalName("Fluffkins");
        assertEquals("Fluffkins", animal.getAnimalName());
    }

    @Test
    public void canGetAnimalSpaceRequired() {
        Animal animal = new Animal(Species.ARESDOGE);
        assertEquals(4, animal.getSpaceRequired());
    }

}