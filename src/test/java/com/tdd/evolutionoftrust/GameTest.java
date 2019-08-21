package com.tdd.evolutionoftrust;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.PrintStream;
import java.util.Scanner;

public class GameTest {

    private Game game;
    PrintStream stream;
    @BeforeEach
    void itShouldInitializeGameInstance() {
        Player player1 = new Player(new Scanner("CHEAT"));
        Player player2 = new Player(new Scanner("CHEAT"));

        //PrintStream stream = Mockito.mock(PrintStream.class);
        game = new Game(player1, player2, 1, new Machine(), stream);
        Assertions.assertNotNull(game);
    }

    @Test
    void itShouldStartTheGame() {
        Player player1 = new Player(new Scanner("CHEAT"));
        Player player2 = new Player(new Scanner("CHEAT"));


        PrintStream stream = Mockito.mock(PrintStream.class);

        game = new Game(player1, player2, 1, new Machine(), stream);

        game.start();

        Mockito.verify(stream).println("player1 : 0 player2 : 0");
    }

    @Test
    public void itShouldRunForFiveRounds(){
        Player player1 = new Player(new Scanner("COOPERATE\nCOOPERATE\nCOOPERATE\nCOOPERATE\nCOOPERATE"));
        Player player2 = new Player(new Scanner("CHEAT\nCHEAT\nCHEAT\nCHEAT\nCHEAT"));

        PrintStream stream = Mockito.mock(PrintStream.class);

        game = new Game(player1, player2, 5, new Machine(), stream);
        game.start();

        Mockito.verify(stream).println("player1 : -1 player2 : 3");
        Mockito.verify(stream).println("player1 : -2 player2 : 6");
        Mockito.verify(stream).println("player1 : -3 player2 : 9");
        Mockito.verify(stream).println("player1 : -4 player2 : 12");
        Mockito.verify(stream).println("player1 : -5 player2 : 15");
    }

}
