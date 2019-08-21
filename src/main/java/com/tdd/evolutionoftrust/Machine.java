package com.tdd.evolutionoftrust;

public class Machine {
    public int[] calculateScore(Move move1, Move move2) {
        if(move1 == Move.COOPERATE && move2 == Move.COOPERATE)
            return new int[] {2,2};
        if(move1 == Move.CHEAT && move2 == Move.CHEAT)
            return new int[] {0,0};
        if(move1 == Move.COOPERATE && move2 == Move.CHEAT)
            return new int[] {-1,3};
        return new int[]{3, -1};
    }
}
