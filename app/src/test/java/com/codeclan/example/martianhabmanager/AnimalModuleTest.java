package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 02/06/2017.
 */
public class AnimalModuleTest {

    @Test
    public void moduleCanAcceptBatchOfAnimals() {
        AnimalModule animalModule = new AnimalModule();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Carnivore carnivore2 = new Carnivore(AnimalSpecies.ARESDOGE);
        Carnivore carnivore3 = new Carnivore(AnimalSpecies.ARESDOGE);

        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(carnivore);
        batch.add(carnivore2);
        batch.add(carnivore3);
        animalModule.acceptAnimalBatch(batch, 30);

        assertEquals(3, animalModule.animalCount());
    }

    @Test
    public void canCountModuleAnimals() {
        AnimalModule animalModule = new AnimalModule();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Carnivore carnivore2 = new Carnivore(AnimalSpecies.ARESDOGE);
        Carnivore carnivore3 = new Carnivore(AnimalSpecies.ARESDOGE);

        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(carnivore);
        batch.add(carnivore2);
        batch.add(carnivore3);
        animalModule.acceptAnimalBatch(batch, 30);

        assertEquals(3, animalModule.animalCount());
    }

    @Test
    public void canGetModuleSize() {
        AnimalModule animalModule = new AnimalModule();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Carnivore carnivore2 = new Carnivore(AnimalSpecies.ARESDOGE);
        Carnivore carnivore3 = new Carnivore(AnimalSpecies.ARESDOGE);

        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(carnivore);
        batch.add(carnivore2);
        batch.add(carnivore3);
        animalModule.acceptAnimalBatch(batch, 30);

        assertEquals(12, animalModule.getTotalSpace());
    }


    @Test
    public void cantOverfillModule() {
        AnimalModule animalModule = new AnimalModule();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Carnivore carnivore2 = new Carnivore(AnimalSpecies.ARESDOGE);
        Carnivore carnivore3 = new Carnivore(AnimalSpecies.ARESDOGE);

        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(carnivore);
        batch.add(carnivore2);
        batch.add(carnivore3);
        animalModule.acceptAnimalBatch(batch, 8);

        assertEquals(2, animalModule.animalCount());

    }


    @Test
    public void canRemoveAnimalsBySpecies() {
        AnimalModule animalModule = new AnimalModule();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Herbivore herbivore1 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.RED_DWARF);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(carnivore);
        batch.add(herbivore1);
        batch.add(herbivore2);
        animalModule.acceptAnimalBatch(batch, 30);

        animalModule.removeSpecies(AnimalSpecies.ARESDOGE.getSpeciesDescription());

        assertEquals(2, animalModule.animalCount());
    }

    @Test
    public void canRemoveAnimalsBySpeciesNotHardcoded() {
        AnimalModule animalModule = new AnimalModule();
        Carnivore carnivore = new Carnivore(AnimalSpecies.ARESDOGE);
        Herbivore herbivore1 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        Herbivore herbivore2 = new Herbivore(AnimalSpecies.MARTIAN_LOP);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(carnivore);
        batch.add(herbivore1);
        batch.add(herbivore2);
        animalModule.acceptAnimalBatch(batch, 30);
        animalModule.removeSpecies(AnimalSpecies.MARTIAN_LOP.getSpeciesDescription());

        assertEquals(1, animalModule.animalCount());
    }

}