package org.example;

import java.util.Objects;

public class GameLogic {
    public static void startGame() {
        ConsoleReader consoleReader = new ConsoleReader();
        if (consoleReader.greetingMessage() == true){
            for (int i = 0; i < 10; i++) {
                System.out.println("Step " + (i + 1));
                HangmanPrinter.printHangman(i);
                System.out.println("");
            }
        }
    }
}