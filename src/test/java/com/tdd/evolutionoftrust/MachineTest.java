package com.tdd.evolutionoftrust;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class MachineTest {

    private Machine machine;

    @BeforeEach
    void setup() {
        machine = new Machine();
    }


    @Test
    void itShouldCalculateThePlayersOutputScoreWhenPlayer1CheatsAndPlayer2Cooperates() {
        Player player1 = new Player(new Scanner("CHEAT"));
        Player player2 = new Player(new Scanner("COOPERATE"));
        Move move1 = player1.makeMove();
        Move move2 = player2.makeMove();
        int[] scores = machine.calculateScore(move1, move2);
        Assertions.assertArrayEquals(new int[]{3, -1}, scores);
    }

    @Test
    void itShouldCalculateThePlayersOutputScoreWhenBothPlayersCooperate() {
        Player player1 = new Player(new Scanner("COOPERATE"));
        Player player2 = new Player(new Scanner("COOPERATE"));
        Move move1 = player1.makeMove();
        Move move2 = player2.makeMove();
        int[] scores = machine.calculateScore(move1, move2);
        Assertions.assertArrayEquals(new int[]{2, 2}, scores);
    }

    @Test
    void itShouldCalculateThePlayersOutputWhenBothCheats(){
        Player player1 = new Player(new Scanner("CHEAT"));
        Player player2 = new Player(new Scanner("CHEAT"));
        Move move1 = player1.makeMove();
        Move move2 = player2.makeMove();
        int[] scores = machine.calculateScore(move1, move2);
        Assertions.assertArrayEquals(new int[]{0, 0}, scores);
    }

    @Test
    void y() {
        Player player1 = new Player(new Scanner("COOPERATE"));
        Player player2 = new Player(new Scanner("CHEAT"));
        Move move1 = player1.makeMove();
        Move move2 = player2.makeMove();
        int[] scores = machine.calculateScore(move1, move2);
        Assertions.assertArrayEquals(new int[]{-1, 3}, scores);
    }
}
