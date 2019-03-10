package com.step.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<String> board = new ArrayList<>(9);

    public Board() {
        this.board.add(" ");
        this.board.add(" ");
        this.board.add(" ");
        this.board.add(" ");
        this.board.add(" ");
        this.board.add(" ");
        this.board.add(" ");
        this.board.add(" ");
        this.board.add(" ");
    }

    public List<String> getBoard() {
        return this.board;
    }

    public void printBoard(){
        System.out.println(this.board.get(0)+"|"+this.board.get(1)+"|"+this.board.get(2));
        System.out.println(this.board.get(3)+"|"+this.board.get(4)+"|"+this.board.get(5));
        System.out.println(this.board.get(6)+"|"+this.board.get(7)+"|"+this.board.get(8));
    }

    public void placeSymbol(int position, String symbol){
        this.board.set(position-1,symbol);
    }
}
