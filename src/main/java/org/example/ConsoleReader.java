package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    private BufferedReader bufferedReader;

    public ConsoleReader() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public boolean greetingMessage() {
        System.out.print("Hi, ready to challenge me and beat me in the Hangman game?\n" +
                "(Enter your choice play or exit)\n" +
                "1)Play\n" +
                "2)Exit\n" +
                "Enter choice: ");
        return readChoice();
    }

    private boolean readChoice() {
        try {
            String choice = bufferedReader.readLine().toLowerCase();
            return verificationChoice(choice);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean verificationChoice(String choice) {
        if (choice.equals("play")) {
            System.out.println("\nPlaying...\n");
            return true;
        } else if (choice.equals("exit")) {
            System.exit(0);
        } else {
            System.out.println("\nInvalid choice. Please try again.\n");
            return greetingMessage();
        }
        return false;
    }

    public char enterLetter() {
        try {
            System.out.print("Enter a letter: ");
            String input = bufferedReader.readLine();

            if (input.isEmpty()) {
                System.out.println("You did not enter a letter!");
                return 0;
            }

            char letter = input.charAt(0);

            if (input.length() > 1) {
                System.out.println("You entered more than one letter! Only the first letter will be used: " + letter);
            }
            return letter;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}