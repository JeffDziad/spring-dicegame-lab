package com.JeffDziad.dice.classes;

import com.JeffDziad.dice.interfaces.GameInput;
import javax.swing.*;

public class PopupInput implements GameInput {

    public PopupInput() {
        System.out.println("PopupInput constructor");
    }

    @Override
    public String getInput(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}
