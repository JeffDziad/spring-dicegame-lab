package com.JeffDziad.dice;

public class Utils {
    public static int randInt(int min, int max) {
        return (int) (Math.random() * (max-min) + min);
    }
}