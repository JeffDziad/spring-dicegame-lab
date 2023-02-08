package com.JeffDziad.dice.classes;

import com.JeffDziad.dice.interfaces.GameOutput;
import javax.swing.*;

public class PopupOutput implements GameOutput {

    public PopupOutput() {
        System.out.println("PopupOutput constructor");
    }

    @Override
    public void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
}