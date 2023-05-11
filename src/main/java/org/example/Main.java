package org.example;

import static org.example.GameLogic.startGame;

public class Main {
    public static void main(String[] args) {
        startGame();
    }

    void foo(char[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("Hello");
            System.out.print("^^^^^");
        }
    }
}