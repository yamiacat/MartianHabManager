package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 03/06/2017.
 */
public class HerbivoreTest {

    //THESE TESTS TO HELP ME UNDERSTAND INHERITANCE

    @Test
    public void herbivoreHasName() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        assertEquals("Specimen 000-Hexagon", herbivore.getAnimalName());

    }

    @Test
    public void herbivoresStartWithHealthyStatus() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        assertEquals("healthy", herbivore.getHealthStatus());
    }



}