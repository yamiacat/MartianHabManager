package com.codeclan.example.martianhabmanager;

import java.util.ArrayList;

/**
 * Created by user on 29/05/2017.
 */

public class Base {
    private String baseName;
    private ArrayList<Hab> allHabs;


    public Base() {
        this.baseName = "MarsBaseOne";
        this.allHabs = new ArrayList<Hab>();
        startingHabs();
    }

    private void startingHabs() {
        Hab hab1 = new Hab("Main Dome", 90);
        Hab hab2 = new Hab("Holding Pen", 50);
        Hab hab3 = new Hab("Secure Containment", 20);
        allHabs.add(hab1);
        allHabs.add(hab2);
        allHabs.add(hab3);
    }

    public String getBaseName() {
        return this.baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public ArrayList<Hab> checkAllHabs() {
        return new ArrayList<>(this.allHabs);
    }
}
