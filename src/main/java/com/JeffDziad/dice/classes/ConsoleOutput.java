package com.JeffDziad.dice.classes;

import com.JeffDziad.dice.interfaces.GameOutput;

public class ConsoleOutput implements GameOutput {
    @Override
    public void output(String text) {
        System.out.println(text);
    }
}