package com.tdd.evolutionoftrust;

import java.io.PrintStream;

public class Game {

    private final int rounds;
    private Machine machine;
    private PrintStream printStream;
    private Player player1;
    private Player player2;


    public Game(Player player1, Player player2, int rounds, Machine machine, PrintStream stream) {
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = rounds;
        this.machine = machine;
        this.printStream = stream;
    }

    public void start() {
        int i = 0;
        int player1Score = 0;
        int player2Score = 0;
        while (i < rounds) {
            int scores[] = machine.calculateScore(player1.makeMove(), player2.makeMove());
            player1Score += scores[0];
            player2Score += scores[1];
        }
        printStream.println("player1 : " + player1Score + " player2 : " + player2Score);
    }
}
