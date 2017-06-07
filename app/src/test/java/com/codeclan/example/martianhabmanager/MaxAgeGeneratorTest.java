package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxAgeGeneratorTest {

    @Test
    public void maxAgeGeneratorGivesDwarfRabbitsShortLifeSpan() {
        FakeDice dice = new FakeDice(5);
        MaxAgeGenerator maxAgeGenerator = new MaxAgeGenerator(dice);
        assertEquals(15, maxAgeGenerator.getMaxAge(AnimalSpecies.RED_DWARF));
    }

    @Test
    public void maxAgeGeneratorGivesLopRabbitsMediumLifeSpan() {
        FakeDice dice = new FakeDice(5);
        MaxAgeGenerator maxAgeGenerator = new MaxAgeGenerator(dice);
        assertEquals(30, maxAgeGenerator.getMaxAge(AnimalSpecies.MARTIAN_LOP));
    }

    @Test
    public void maxAgeGeneratorGivesDogesLongLifeSpan() {
        FakeDice dice = new FakeDice(5);
        MaxAgeGenerator maxAgeGenerator = new MaxAgeGenerator(dice);
        assertEquals(45, maxAgeGenerator.getMaxAge(AnimalSpecies.ARESDOGE));
    }

}