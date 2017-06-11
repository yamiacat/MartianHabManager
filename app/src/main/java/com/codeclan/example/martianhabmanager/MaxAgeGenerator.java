package com.codeclan.example.martianhabmanager;


public class MaxAgeGenerator {
    private int maxAge;
    private Rollable dice;

    public MaxAgeGenerator(Rollable dice) {
        this.dice = dice;

    }

    private int calculateMaxAge(AnimalSpecies species) {
        maxAge = (10 * species.getSpeciesLongevity()) +
                (dice.rollDice() * species.getSpeciesLongevity());
        return maxAge;
    }

    public int getMaxAge(AnimalSpecies species) {
        return calculateMaxAge(species);
    }

}
