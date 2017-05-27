package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 27/05/2017.
 */

public class DefaultNamer {
    private String defaultName;


    public DefaultNamer(Rollable dice) {
        this.defaultName = createDefaultName(dice);
    }

    private String createDefaultName(Rollable dice) {
        String returnString = "";

        String[] nameElement1 = {
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

        returnString += nameElement1[dice.rollDice()-1];
        returnString += " " + (dice.rollDice()-1) + (dice.rollDice()-1) + (dice.rollDice()-1);

        String[] nameElement2 = {
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
        returnString += "-" + nameElement2[dice.rollDice()-1];
        return returnString;
        }

        public String getDefaultName() {
            return this.defaultName;
        }

    }


