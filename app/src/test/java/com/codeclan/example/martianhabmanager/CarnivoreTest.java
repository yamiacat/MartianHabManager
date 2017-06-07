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

//ACTUAL TESTS

    @Test
    public void healthyCarnivoreLeftToGoHungryLosesOneHealth() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Hab hab = new Hab("Capricorn One", 100);

        carnivore.goHungry(hab);

        assertEquals(2, carnivore.getHealth());
    }

    @Test
    public void hungryCarnivoreLeftToGoHungryBecomesStarving() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Hab hab = new Hab("Capricorn One", 100);

        carnivore.goHungry(hab);
        carnivore.goHungry(hab);

        assertEquals("starving", carnivore.getHealthStatus());
    }

    @Test
    public void carnivoresLeftToGoHungryDieSadFace() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Hab hab = new Hab("Capricorn One", 100);

        carnivore.goHungry(hab);
        carnivore.goHungry(hab);
        carnivore.goHungry(hab);

        assertEquals("dead", carnivore.getHealthStatus());
    }




}