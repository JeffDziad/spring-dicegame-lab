package com.JeffDziad.dice;

import com.JeffDziad.dice.classes.ConsoleInput;
import com.JeffDziad.dice.classes.ConsoleOutput;
import com.JeffDziad.dice.classes.PopupInput;
import com.JeffDziad.dice.classes.PopupOutput;
import com.JeffDziad.dice.classes.NSidedDie;
import com.JeffDziad.dice.interfaces.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.JeffDziad.dice")
public class AppConfig {
    @Bean
    public GameOutput gameOutput() {
        //return new ConsoleOutput();
        return new PopupOutput();
    }

    @Bean
    public GameInput gameInput() {
        //return new ConsoleInput();
        return new PopupInput();
    }

    @Bean
    public DieRoller dieRoller() {
        return new NSidedDie(12);
    }
}