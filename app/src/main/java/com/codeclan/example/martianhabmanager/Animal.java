package com.codeclan.example.martianhabmanager;

public abstract class Animal {
    private FakeDice dice = new FakeDice(1);
    private DefaultNamer namer = new DefaultNamer(dice);
    private MaxAgeGenerator maxAgeGenerator = new MaxAgeGenerator(dice);
    private String animalName;
    private AnimalSpecies species;
    private int resourcesRequired;
    private int health;
    private String healthStatus;
    private int maxAge;
    private int age;
//    private String maturity;
//    private int fecundity;
//    private int o2Required;
//    private int nutritionalValue;

    public Animal(AnimalSpecies species) {
        this.species = species;
        this.animalName = namer.getDefaultName();
        this.resourcesRequired = species.getSpeciesResourcesRequired();
        this.health = 3;
        this.healthStatus = calculateHealthStatus();
        this.age = 0;
        this.maxAge = maxAgeGenerator.getMaxAge(species);

    }


    public abstract void getFed();

    private String calculateHealthStatus() {
        if (0 == this.health) {
            return "dead";
        }
        else if (1 == this.health) {
            return "starving";
        }
        else if (2 == this.health) {
            return "hungry";
        }
        else if (3 == this.health) {
            return "healthy";
        }
        return null;
    }

    public String getSpecies() {
        return this.species.getSpeciesDescription();
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalName(String name) {
        this.animalName = name;
    }

    public int getResourcesRequired() {
        return this.resourcesRequired;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public String getHealthStatus() {
        return calculateHealthStatus();
    }


    public abstract void goHungry(Hab hab);

    public int getAge() {
        return this.age;
    }

    public int getMaxAge() {
        return this.maxAge;
    }
}
