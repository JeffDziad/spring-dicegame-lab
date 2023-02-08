package com.JeffDziad.dice.classes;

import com.JeffDziad.dice.Utils;
import com.JeffDziad.dice.interfaces.DieRoller;

public class NSidedDie implements DieRoller {
    private int sides;
    public NSidedDie(int sides) {
        this.sides = sides;
        System.out.println("Dice Sides: " + this.sides);
    }
    @Override
    public int roll() {
        return Utils.randInt(1, this.sides);
    }
}
