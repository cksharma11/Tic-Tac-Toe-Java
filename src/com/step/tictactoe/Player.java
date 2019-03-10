package com.step.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private String symbol;
    private List<Integer> moves;

    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
        this.moves = new ArrayList<>(5);
    }

    public List<Integer> getMoves() {
        return this.moves;
    }

    public void saveMove(int position){
        this.moves.add(position);
    }
}
