package com.JeffDziad.dice.classes;

import com.JeffDziad.dice.Utils;
import com.JeffDziad.dice.interfaces.DieRoller;

public class EightSidedDie implements DieRoller {
    public EightSidedDie() {
        System.out.println("EightSidedDie initialized.");
    }
    @Override
    public int roll() {
        return Utils.randInt(1, 8);
    }
}