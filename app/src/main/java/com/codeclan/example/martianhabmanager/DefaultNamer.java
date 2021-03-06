package com.codeclan.example.martianhabmanager;

public class DefaultNamer {
    private String defaultName;
    private String[] nameElement1 = {
            "Specimen",
            "Sample",
            "Subject",
            "Archetype",
            "Pattern",
            "Exemplar",
            "Model",
            "Instance",
            "Type",
            "Exhibit"
    };
    private String[] nameElement2 = {
            "Hexagon",
            "Cerulean",
            "Gamma",
            "Vortigern",
            "Magna",
            "Chordata",
            "Rhombus",
            "Paisley",
            "Kallisti",
            "Dragon"
    };


    public DefaultNamer(Rollable dice) {
        this.defaultName = createDefaultName(dice);
    }

    private String createDefaultName(Rollable dice) {
        String returnString = "";
        returnString += nameElement1[dice.rollDice()-1];
        returnString += " " + (dice.rollDice()-1) + (dice.rollDice()-1) + (dice.rollDice()-1);
        returnString += "-" + nameElement2[dice.rollDice()-1];
        return returnString;
        }

        public String getDefaultName() {
            return this.defaultName;
        }

    }


