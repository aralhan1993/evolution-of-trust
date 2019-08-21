package com.tdd.evolutionoftrust;

import java.util.Scanner;

public class Player {

    private Scanner reader;

    public Player(Scanner scanner) {
        this.reader = scanner;
    }

    public Move makeMove() {
        return Move.valueOf(reader.nextLine());
    }
}