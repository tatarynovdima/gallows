package org.example;

public class HangmanPrinter {
    private static final String[] HANGMAN_ASCII = {
            "|\n|\n|\n|\n|\n|______",
            "_______\n|\n|\n|\n|\n|\n|______",
            "_______\n|/\n|\n|\n|\n|\n|______",
            "_______\n|/   |\n|\n|\n|\n|\n|______",
            "_______\n|/   |\n|    O\n|\n|\n|\n|______",
            "_______\n|/   |\n|    O\n|   ( )\n|\n|\n|______",
            "_______\n|/   |\n|    O\n|   ( )\\\n|\n|\n|______",
            "_______\n|/   |\n|    O\n|  /( )\\\n|\n|\n|______",
            "_______\n|/   |\n|    O\n|  /( )\\\n|   /\n|\n|_______",
            "_______\n|/   |\n|    O\n|  /( )\\\n|   / \\\n|\n|_______",
    };

    public static void printHangman(int incorrectGuesses) {
        if (incorrectGuesses >= 0 && incorrectGuesses < HANGMAN_ASCII.length) {
            System.out.println(HANGMAN_ASCII[incorrectGuesses]);
        } else {
            System.out.println("Invalid number of incorrect guesses.");
        }
    }
}

