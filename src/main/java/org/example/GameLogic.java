package org.example;

import java.util.Arrays;

public class GameLogic {
    private static final PropertiesReader propertiesReader = new PropertiesReader();
    private static final char[] CHARS = propertiesReader.readDictionaryFromFile();

    public static void startGame() {
        ConsoleReader consoleReader = new ConsoleReader();
        GameLogic gameLogic = new GameLogic();

        if (consoleReader.greetingMessage()) {
            String word = Arrays.toString(propertiesReader.readDictionaryFromFile());
            String wordStatus = "_".repeat(word.length());

            System.out.println("I made a word...");
            int maxMistakes = consoleReader.chooseDifficultyLevel();
            int mistakes = 0;
            while (mistakes < maxMistakes) {
                char letter = consoleReader.enterLetter();
                boolean isLetterInWord = gameLogic.checkLetterInArray(letter);

                if (isLetterInWord) {
                    if (!gameLogic.isLetterAlreadyGuessed(letter, wordStatus)) {
                        wordStatus = gameLogic.updateWordStatus(word, letter, wordStatus);
                    }
                    System.out.println(wordStatus);
                    if (gameLogic.isWordGuessed(word, wordStatus)) {
                        System.out.println("Congratulations! You have guessed the word!");
                        return;
                    }
                } else {
                    mistakes++;
                    HangmanPrinter.printHangman(mistakes);
                    System.out.println("Mistakes: " + mistakes + "/" + maxMistakes);
                }
            }

            System.out.println("You lost! The word was " + word);
        }
    }


    private boolean checkLetterInArray(char letter) {
        for (char element : GameLogic.CHARS) {
            if (element == letter) {
                return true;
            }
        }
        return false;
    }

    private boolean isLetterAlreadyGuessed(char letter, String wordStatus) {
        return wordStatus.contains(String.valueOf(letter));
    }

    private String updateWordStatus(String word, char letter, String wordStatus) {
        StringBuilder sb = new StringBuilder(wordStatus);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                sb.setCharAt(i, letter);
            }
        }
        return sb.toString();
    }

    private boolean isWordGuessed(String word, String wordStatus) {
        return word.equals(wordStatus);
    }
}
