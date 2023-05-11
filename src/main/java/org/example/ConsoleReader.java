package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public String readChoice(){
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Hi, ready to challenge me and beat me in the Hangman game?\n" +
                    "(Enter your choice play or exit)\n"+
                    "1)Play\n" +
                    "2)Exit\n" +
                    "Enter choice: ");
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}