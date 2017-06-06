package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

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


    @Test
    public void healthyHerbivoreLeftToFeedSelfLosesOneHealth() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);

        herbivore.feedSelf(hab);

        assertEquals(2, herbivore.getHealth());
    }

    @Test
    public void healthyHerbivoreLeftToFeedSelfBecomesHungry() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);

        herbivore.feedSelf(hab);

        assertEquals("hungry", herbivore.getHealthStatus());
    }

    @Test
    public void hungryHerbivoreLeftToFeedSelfBecomesStarving() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);

        herbivore.feedSelf(hab);
        assertEquals("hungry", herbivore.getHealthStatus());

        herbivore.feedSelf(hab);
        assertEquals("starving", herbivore.getHealthStatus());
    }




}