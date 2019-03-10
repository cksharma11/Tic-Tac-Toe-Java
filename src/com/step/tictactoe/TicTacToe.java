package com.step.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
    private static List<List> winningCombinations = new ArrayList<>(8);

    public static void main(String[] args) {
        winningCombinations.add(Arrays.asList(1,2,3));
        winningCombinations.add(Arrays.asList(4,5,6));
        winningCombinations.add(Arrays.asList(7,8,9));
        winningCombinations.add(Arrays.asList(1,4,7));
        winningCombinations.add(Arrays.asList(2,5,8));
        winningCombinations.add(Arrays.asList(3,6,9));
        winningCombinations.add(Arrays.asList(1,5,9));
        winningCombinations.add(Arrays.asList(3,5,7));

        Board gameBoard = new Board();
        Player player1 = new Player("chandan", "O");
        Player player2 = new Player("chandan", "X");
        {
            gameBoard.placeSymbol(2, "O");
            player2.saveMove(2);

            gameBoard.placeSymbol(3, "X");
            player1.saveMove(3);

            gameBoard.placeSymbol(4, "O");
            player2.saveMove(4);

            gameBoard.placeSymbol(5, "X");
            player1.saveMove(5);

            gameBoard.placeSymbol(6, "O");
            player2.saveMove(6);

            gameBoard.placeSymbol(7, "X");
            player1.saveMove(7);

            gameBoard.placeSymbol(8, "O");
            player2.saveMove(8);
        }
        gameBoard.printBoard();


        boolean hasWon = hasWon(winningCombinations, player1.getMoves());
        System.out.println("Has anybody won : "+ hasWon);
    }

    public static boolean hasWon(List<List> winningCombinations, List<Integer> playerMoves){
        return winningCombinations.stream().anyMatch(combination->combination.equals(playerMoves));
    }

}
