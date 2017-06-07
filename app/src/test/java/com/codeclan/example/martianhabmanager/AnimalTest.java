package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void animalHasSpecies() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        assertEquals("Ares Doge", carnivore.getSpecies());
    }

    @Test
    public void animalHasDefaultName() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        assertEquals("Specimen 000-Hexagon", carnivore.getAnimalName());
    }

    @Test
    public void animalNameCanBeSet() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        carnivore.setAnimalName("Fluffkins");
        assertEquals("Fluffkins", carnivore.getAnimalName());
    }

    @Test
    public void canGetAnimalSpaceRequired() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        assertEquals(4, carnivore.getResourcesRequired());
    }

    @Test
    public void animalsStartWithThreeHealth() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        assertEquals(3, carnivore.getHealth());
    }

    @Test
    public void animalsStartWithHealthyStatus() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        assertEquals("healthy", carnivore.getHealthStatus());
    }

    @Test
    public void newAnimalsStartWithAge0() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        assertEquals(0, carnivore.getAge());
    }

    @Test
    public void newAnimalsStartWithRollableMaxAge() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        assertEquals(33, carnivore.getMaxAge());
    }

    @Test
    public void newAnimalsStartAsImmature() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        assertEquals("immature", carnivore.getMaturity());
    }

    @Test
    public void canSetAnimalAge() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        carnivore.setAge(31);
        assertEquals(31, carnivore.getAge());
        assertEquals("past breeding", carnivore.getMaturity());
    }

    @Test
    public void middleAgeAnimalsAreMature() {
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        carnivore.setAge(20);
        assertEquals("mature", carnivore.getMaturity());
    }

    @Test
    public void canGetSex() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        assertEquals("female", herbivore.getSex().getSexDescription());

    }


}