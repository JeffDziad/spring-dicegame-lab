package com.JeffDziad.dice.classes;

import com.JeffDziad.dice.interfaces.GameInput;
import java.util.Scanner;

public class ConsoleInput implements GameInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}