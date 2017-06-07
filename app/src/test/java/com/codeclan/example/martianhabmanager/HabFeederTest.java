package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class HabFeederTest {

    @Test
    public void habFeederReportsTotalHunger() {
        HabFeeder habFeeder = new HabFeeder();
        Hab hab = new Hab("Capricorn One", 100);
        ArrayList<Animal> animalBatch = new ArrayList<>();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Herbivore herbivore1 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.RED_DWARF);
        animalBatch.add(carnivore);
        animalBatch.add(herbivore1);
        animalBatch.add(herbivore2);
        hab.houseAnimals(animalBatch);


        assertEquals("Carnivore requirement = 4, Herbivore requirement = 3.", habFeeder.reportTotalHunger(hab));
    }

    @Test
    public void habFeederFeedsCarnivores() {
        HabFeeder habFeeder = new HabFeeder();
        Hab hab = new Hab("Capricorn One", 100);
        FoodStore foodStore = new FoodStore();
        ArrayList<Animal> animalBatch = new ArrayList<>();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Herbivore herbivore1 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.RED_DWARF);
        animalBatch.add(carnivore);
        animalBatch.add(herbivore1);
        animalBatch.add(herbivore2);
        hab.houseAnimals(animalBatch);

        habFeeder.feedAnimals(foodStore, hab);


        assertEquals(46, foodStore.getMeat());
    }

    @Test
    public void habFeederFeedsHerbivores() {
        HabFeeder habFeeder = new HabFeeder();
        Hab hab = new Hab("Capricorn One", 100);
        FoodStore foodStore = new FoodStore();
        ArrayList<Animal> animalBatch = new ArrayList<>();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Herbivore herbivore1 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.RED_DWARF);
        animalBatch.add(carnivore);
        animalBatch.add(herbivore1);
        animalBatch.add(herbivore2);
        hab.houseAnimals(animalBatch);

        habFeeder.feedAnimals(foodStore, hab);

        assertEquals(47, foodStore.getVeg());
    }

    @Test
    public void deadHerbivoresGetRemoved() {
        HabFeeder habFeeder = new HabFeeder();
        FoodStore foodStore = new FoodStore();
        Herbivore herbivore = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Hab hab = new Hab("Capricorn One", 100);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(herbivore);
        hab.houseAnimals(batch);

        herbivore.goHungry(hab);
        herbivore.goHungry(hab);
        herbivore.goHungry(hab);
        habFeeder.harvestCorpses(foodStore, hab);

        assertEquals(0, hab.getAnimalModule().animalCount());
        assertEquals(52, foodStore.getMeat());
    }

    @Test
    public void deadCarnivoresGetRemoved() {
        HabFeeder habFeeder = new HabFeeder();
        FoodStore foodStore = new FoodStore();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Hab hab = new Hab("Capricorn One", 100);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(carnivore);
        hab.houseAnimals(batch);

        carnivore.goHungry(hab);
        carnivore.goHungry(hab);
        carnivore.goHungry(hab);
        habFeeder.harvestCorpses(foodStore, hab);

        assertEquals(0, hab.getAnimalModule().animalCount());
        assertEquals(54, foodStore.getMeat());
    }

}