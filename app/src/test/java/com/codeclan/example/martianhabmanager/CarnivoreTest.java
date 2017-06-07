package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import java.util.ArrayList;

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


    @Test
    public void hungryCarnivoreLeftToFeedSelfEatsHerbivores() {
        ArrayList<Animal> batch = new ArrayList<>();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);
        batch.add(herbivore);
        batch.add(herbivore2);
        batch.add(carnivore);
        hab.houseAnimals(batch);

        carnivore.goHungry(hab);
        carnivore.goHungry(hab);
        assertEquals("healthy", carnivore.getHealthStatus());
        assertEquals(1, hab.getAnimalModule().animalCount());
        assertEquals(3, carnivore.getHealth());
    }

    @Test
    public void hungryCarnivoreWithoutEnoughHerbivoresToEatStillStarves() {
        ArrayList<Animal> batch = new ArrayList<>();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);
        batch.add(herbivore);
        batch.add(carnivore);
        hab.houseAnimals(batch);

        carnivore.goHungry(hab);
        carnivore.goHungry(hab);
        assertEquals("hungry", carnivore.getHealthStatus());
        assertEquals(1, hab.getAnimalModule().animalCount());
        assertEquals(2, carnivore.getHealth());
    }

}