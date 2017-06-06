package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import java.util.ArrayList;

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
    public void healthyHerbivoreLeftToGoHungryLosesOneHealth() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);

        herbivore.goHungry(hab);

        assertEquals(2, herbivore.getHealth());
    }

    @Test
    public void healthyHerbivoreLeftToGoHungryBecomesHungry() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);

        herbivore.goHungry(hab);

        assertEquals("hungry", herbivore.getHealthStatus());
    }

    @Test
    public void hungryHerbivoreLeftToGoHungryBecomesStarving() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);

        herbivore.goHungry(hab);
        assertEquals("hungry", herbivore.getHealthStatus());

        herbivore.goHungry(hab);
        assertEquals("starving", herbivore.getHealthStatus());
    }

    @Test
    public void hungryHerbivoreLeftToFeedSelfRaidsCrops() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);
        Crop crop = new Crop(CropSpecies.RED_ALGAE, 10);
        hab.plantCrops(crop);

        herbivore.goHungry(hab);
        herbivore.goHungry(hab);
        assertEquals("healthy", herbivore.getHealthStatus());
        assertEquals(6, crop.getQuantity());
    }

    @Test
    public void hungryHerbivoresDevourCrops() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.MARTIAN_LOP);

        Hab hab = new Hab("Capricorn One", 100);
        Crop crop = new Crop(CropSpecies.RED_ALGAE, 8);
        hab.plantCrops(crop);

        herbivore.goHungry(hab);
        herbivore.goHungry(hab);
        herbivore2.goHungry(hab);
        herbivore2.goHungry(hab);
        assertEquals(0, hab.getCropModule().cropSpeciesCount());
        assertEquals(0, hab.getCropModule().getTotalQuantity());
    }

    @Test
    public void hungryHerbivoresDevourMultipleCrops() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.MARTIAN_LOP);

        Hab hab = new Hab("Capricorn One", 100);
        Crop crop = new Crop(CropSpecies.RED_ALGAE, 4);
        Crop crop2 = new Crop(CropSpecies.WHITE_FLUFF, 4);

        hab.plantCrops(crop);
        hab.plantCrops(crop2);

        herbivore.goHungry(hab);
        herbivore.goHungry(hab);
        herbivore2.goHungry(hab);
        herbivore2.goHungry(hab);
        assertEquals(0, hab.getCropModule().cropSpeciesCount());
        assertEquals(0, hab.getCropModule().getTotalQuantity());
    }

    @Test
    public void hungryHerbivoresGoBackToStarvingAfterDevouringCrops() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);
        Crop crop = new Crop(CropSpecies.RED_ALGAE, 4);
        hab.plantCrops(crop);

        herbivore.goHungry(hab);
        assertEquals("hungry", herbivore.getHealthStatus());

        herbivore.goHungry(hab);
        assertEquals("healthy", herbivore.getHealthStatus());

        herbivore.goHungry(hab);
        assertEquals("hungry", herbivore.getHealthStatus());
    }

    @Test
    public void starvedToDeathHerbivoresDieSadFace() {
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(herbivore);
        hab.houseAnimals(batch);

        herbivore.goHungry(hab);
        assertEquals("hungry", herbivore.getHealthStatus());

        herbivore.goHungry(hab);
        assertEquals("starving", herbivore.getHealthStatus());

        herbivore.goHungry(hab);
        assertEquals(0, hab.getAnimalModule().animalCount());
    }

}