package com.codeclan.example.martianhabmanager;

public abstract class Animal {
    private FakeDice dice = new FakeDice(1);  //TODO - SWAP FOR REAL DICE
    private DefaultNamer namer = new DefaultNamer(dice);
    private MaxAgeGenerator maxAgeGenerator = new MaxAgeGenerator(dice);
    private SexGenerator sexGenerator = new SexGenerator(dice);
    private String animalName;
    private AnimalSpecies species;
    private int resourcesRequired;
    private int health;
    private String healthStatus;
    private int maxAge;
    private int age;
    private String maturity;
    private Sex sex;
//    private int fecundity;
//    private int o2Required;
//    private int nutritionalValue;

    public Animal(AnimalSpecies species) {
        this.species = species;
        this.animalName = determineDefaultAnimalName();
        this.resourcesRequired = species.getSpeciesResourcesRequired();
        this.health = 3;
        this.healthStatus = calculateHealthStatus();
        this.age = 0;
        this.maxAge = determineMaxAge();
        this.maturity = calculateMaturity();
        this.sex = determineSex();
    }

    //ANIMAL GENERATION STUFF

    private Sex determineSex() {
        return sexGenerator.getSex();
    }

    private String determineDefaultAnimalName() {
        return namer.getDefaultName();
    }

    private int determineMaxAge() {
        return maxAgeGenerator.getMaxAge(this.species);
    }


    //BASIC GETTERS AND SETTERS


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

    public int getAge() {
        return this.age;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    public String getMaturity() {
        return calculateMaturity();
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public Sex getSex() {
        return this.sex;
    }

    public void setSex(Sex newSex) {
        //TODO - REMOVE AFTER TESTING
        this.sex = newSex;
    }

    //FEEDING RELATED STUFF

    public String getHealthStatus() {
        return calculateHealthStatus();
    }

    public abstract void getFed();

    public abstract void goHungry(Hab hab);

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

    //BREEDING RELATED STUFF

    private String calculateMaturity() {
        if (getAge() < (getMaxAge()/8)) {
            return "immature";
        }
        else if (getAge() > (getMaxAge() - (getMaxAge()/8))) {
            return "past breeding";
        }
        else {
            return "mature";
        }
    }

}
