package com.JeffDziad.dice.classes;

import com.JeffDziad.dice.Utils;
import com.JeffDziad.dice.interfaces.DieRoller;

public class SixSidedDie implements DieRoller {
    public SixSidedDie() {
        System.out.println("SixSidedDie initialized.");
    }
    @Override
    public int roll() {
        return Utils.randInt(1, 6);
    }
}
