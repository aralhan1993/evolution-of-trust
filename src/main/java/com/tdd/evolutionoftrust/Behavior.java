package com.tdd.evolutionoftrust;

import java.util.Scanner;

public interface Behavior {

    Move makeMove();

    static Behavior normal(Scanner scanner) {
        return new Normal(scanner);
    }

    static Behavior cheat() {
        return new Cheater();
    }

}

class Normal implements Behavior {

    private Scanner scanner;

    public Normal(Scanner scanner) {

        this.scanner = scanner;
    }

    public Move makeMove() {
        return Move.valueOf(scanner.nextLine());
    }
}

class Cheater implements Behavior {

    public Move makeMove() {
        return Move.CHEAT;
    }
}