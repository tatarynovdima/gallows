package org.example;

import java.util.Objects;

public class GameLogic {
    public static void startGame() {
        ConsoleReader consoleReader = new ConsoleReader();
        GameLogic gameLogic = new GameLogic();
        gameLogic.verificationChoice(consoleReader.readChoice());
    }

    private void verificationChoice(String choice) {
        choice.toLowerCase();
        while (true) {
            if (Objects.equals(choice, "play")) {

            }
            if (Objects.equals(choice, "exit")) {
                break;
            }
        }
    }

}