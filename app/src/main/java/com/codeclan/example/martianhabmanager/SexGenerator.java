package com.codeclan.example.martianhabmanager;


class SexGenerator {
    private Sex sex;


    public SexGenerator(Rollable dice) {
            this.sex = generateSex(dice);
    }

    private Sex generateSex(Rollable dice) {
        if (dice.rollDice() < 5) {
            return Sex.FEMALE;
        }
        else {
            return Sex.MALE;
        }
    }

    public Sex getSex() {
        return this.sex;
    }
}
