package com.tdd.evolutionoftrust;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class PlayerTest {

    private Player player;

    @BeforeEach
    void setup(){
        Scanner scanner = new Scanner("CHEAT");
        player = new Player(Behavior.normal(scanner));
    }

    @Test
    void itShouldMakeMove(){
        Move move = player.makeMove();
        Assertions.assertEquals(Move.CHEAT, move);
    }
}
