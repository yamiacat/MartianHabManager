package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarnivoreTest {

    //THESE TESTS TO HELP ME UNDERSTAND INHERITANCE

    @Test
    public void carnivoreHasName() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        assertEquals("Specimen 000-Hexagon", carnivore.getAnimalName());

    }

    @Test
    public void carnivoreUsesSameSpeciesMethod() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        assertEquals("Ares Doge", carnivore.getSpecies());
    }


}