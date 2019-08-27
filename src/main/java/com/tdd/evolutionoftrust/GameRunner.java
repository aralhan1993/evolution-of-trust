package com.tdd.evolutionoftrust;

import java.util.Scanner;

public class GameRunner {

    public static void main(String args[]){
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Player player1 = new Player(Behavior.normal(scanner1));
        Player player2 = new Player(Behavior.cheat());
        Game game = new Game(player1, player2, 3, new Machine(), System.out);
        game.start();
    }
}
