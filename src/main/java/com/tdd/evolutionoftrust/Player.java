package com.tdd.evolutionoftrust;

import java.util.Scanner;

public class Player {

    private Behavior behavior;

    public Player(Behavior behavior) {
        this.behavior = behavior;
    }

    public Move makeMove() {
        return behavior.makeMove();
    }
}