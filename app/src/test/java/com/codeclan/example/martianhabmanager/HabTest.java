package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class HabTest {


    @Test
    public void habHasName() {
        Hab hab = new Hab("Capricorn One", 100);
        assertEquals("Capricorn One", hab.getHabName());
    }


    @Test
    public void habHasSize() {
        Hab hab = new Hab("Capricorn One", 100);
        assertEquals(100, hab.getHabSize());
    }

    @Test
    public void habStructuralStrengthSetAutomatically() {
        Hab hab = new Hab("Capricorn One", 100);
        assertEquals(10, hab.getStructuralStrength());
    }

    @Test
    public void habSize20Minimum() {
        Hab hab = new Hab("Capricorn Nought", 10);
        assertEquals(20, hab.getHabSize());
    }

    @Test
    public void habSize100Maximum() {
        Hab hab = new Hab("Capricorn Twelvety", 200);
        assertEquals(100, hab.getHabSize());
    }


    @Test
    public void habCanAcceptAnimal() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        hab.acceptAnimal(animal);
        assertEquals(1, hab.animalCount());
    }

    @Test
    public void habCanAcceptBatchOfAnimals() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal3 = new Animal(AnimalSpecies.ARESDOGE);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(animal);
        batch.add(animal2);
        batch.add(animal3);
        hab.acceptAnimalBatch(batch);

        assertEquals(3, hab.animalCount());
    }

    @Test
    public void canAcceptCropPlanting() {
        Hab hab = new Hab("Capricorn One", 100);
        Crop crop = new Crop(CropSpecies.DEIMOS_LETTUCE, 10);
        hab.plantCrops(crop);
        assertEquals(90, hab.remainingSpace());
    }

    @Test
    public void canCountHabAnimals() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.MARTIAN_LOP);
        Animal animal3 = new Animal(AnimalSpecies.RED_DWARF);
        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);

        assertEquals(3, hab.animalCount());
    }

    @Test
    public void canGetUnusedSpace() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.MARTIAN_LOP);
        Animal animal3 = new Animal(AnimalSpecies.RED_DWARF);
        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);

        assertEquals(93, hab.remainingSpace());
    }

    @Test
    public void cantOverfillHab() {
        Hab hab = new Hab("MicroDome", 5);
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal3 = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal4 = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal5 = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal6 = new Animal(AnimalSpecies.ARESDOGE);

        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);
        hab.acceptAnimal(animal4);
        hab.acceptAnimal(animal5);
        hab.acceptAnimal(animal6);

        assertEquals(5, hab.animalCount());
    }


    @Test
    public void canRemoveAnimalsBySpecies() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.MARTIAN_LOP);
        Animal animal3 = new Animal(AnimalSpecies.RED_DWARF);
        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);
        hab.removeSpecies(AnimalSpecies.ARESDOGE.getSpeciesDescription());

        assertEquals(2, hab.animalCount());
    }

    @Test
    public void canRemoveAnimalsBySpeciesNotHardcoded() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.MARTIAN_LOP);
        Animal animal3 = new Animal(AnimalSpecies.MARTIAN_LOP);
        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);
        hab.removeSpecies(AnimalSpecies.MARTIAN_LOP.getSpeciesDescription());

        assertEquals(1, hab.animalCount());
    }

}