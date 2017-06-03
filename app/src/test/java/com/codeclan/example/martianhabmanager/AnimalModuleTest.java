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
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal3 = new Animal(AnimalSpecies.ARESDOGE);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(animal);
        batch.add(animal2);
        batch.add(animal3);
        animalModule.acceptAnimalBatch(batch, 30);

        assertEquals(3, animalModule.animalCount());
    }

    @Test
    public void canCountModuleAnimals() {
        AnimalModule animalModule = new AnimalModule();
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal3 = new Animal(AnimalSpecies.ARESDOGE);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(animal);
        batch.add(animal2);
        batch.add(animal3);
        animalModule.acceptAnimalBatch(batch, 30);

        assertEquals(3, animalModule.animalCount());
    }

    @Test
    public void canGetModuleSize() {
        AnimalModule animalModule = new AnimalModule();
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal3 = new Animal(AnimalSpecies.ARESDOGE);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(animal);
        batch.add(animal2);
        batch.add(animal3);
        animalModule.acceptAnimalBatch(batch, 30);

        assertEquals(12, animalModule.getTotalSpace());
    }


    @Test
    public void cantOverfillModule() {
        AnimalModule animalModule = new AnimalModule();
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal3 = new Animal(AnimalSpecies.ARESDOGE);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(animal);
        batch.add(animal2);
        batch.add(animal3);
        animalModule.acceptAnimalBatch(batch, 8);

        assertEquals(2, animalModule.animalCount());

    }


    @Test
    public void canRemoveAnimalsBySpecies() {
        AnimalModule animalModule = new AnimalModule();
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.MARTIAN_LOP);
        Animal animal3 = new Animal(AnimalSpecies.RED_DWARF);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(animal);
        batch.add(animal2);
        batch.add(animal3);
        animalModule.acceptAnimalBatch(batch, 30);

        animalModule.removeSpecies(AnimalSpecies.ARESDOGE.getSpeciesDescription());

        assertEquals(2, animalModule.animalCount());
    }

    @Test
    public void canRemoveAnimalsBySpeciesNotHardcoded() {
        AnimalModule animalModule = new AnimalModule();
        Animal animal = new Animal(AnimalSpecies.ARESDOGE);
        Animal animal2 = new Animal(AnimalSpecies.MARTIAN_LOP);
        Animal animal3 = new Animal(AnimalSpecies.MARTIAN_LOP);
        ArrayList<Animal> batch = new ArrayList<>();
        batch.add(animal);
        batch.add(animal2);
        batch.add(animal3);
        animalModule.acceptAnimalBatch(batch, 30);
        animalModule.removeSpecies(AnimalSpecies.MARTIAN_LOP.getSpeciesDescription());

        assertEquals(1, animalModule.animalCount());
    }

}