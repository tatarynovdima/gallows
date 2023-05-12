package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameLogic {
    private static final PropertiesReader propertiesReader = new PropertiesReader();
    private static final char[]CHARS = propertiesReader.readDictionaryFromFile();

    public static void startGame() {
        ConsoleReader consoleReader = new ConsoleReader();
        GameLogic gameLogic = new GameLogic();


        if (consoleReader.greetingMessage() == true){
            System.out.println("I made a word...");
            char templetter = consoleReader.enterLetter();
        }
    }


    private void printStepGallows(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Step " + (i + 1));
            HangmanPrinter.printHangman(i);
            System.out.println("");
        }
    }
}