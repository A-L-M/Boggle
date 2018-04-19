/*******************************
 * Author: Alec Mills
 *
 * Represents a Boggle board
 *******************************/

import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class Board {
    //each element of dice represents one of 16 dice included in Boggle
    //each char in String element a face of the die
    private final String[] dice = {"aaeegn","elrtty","aoottw","abbjoo","ehrtvw",
            "cimotu","disstty","eiosst","delvry","achops","himnqu","eeinsu",
            "eeghnw","affkps","hlnnrz","deilrx"};
    //represents the physical layout of the boggle board
    private final Node[][] board;

    public Board() {

        boolean[] diceUsed = new boolean[16];//make sure each 'die' is only used once
        board = new Node[4][4];
        for (int i = 0; i < board.length; i++) {
            setRow(i, diceUsed);
        }

        for (Node[] row : board) {
            for (Node el : row) {
                setNeighbors(el);
            }
        }
    }

    //getters
    public Node getNode(int row, int col) {
        return board[row][col];
    }

    public Node[][] getBoard() {
        return board;
    }

    //constructor helper methods
    private void setRow(int row, boolean[] diceUsed) {
        Random rand = new Random();
        int slotsSet = 0;

        while (slotsSet < 4) { //keep trying until 4 unique dice have been used
            char toTry = rollDie(diceUsed);
            if (toTry != Character.MIN_VALUE) {
                board[row][slotsSet] = new Node(toTry, row, slotsSet);
                slotsSet++;
            }

        }
    } 

    public void setNeighbors(Node node) {
        int row = node.getRow();
        int col = node.getCol();
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                boolean inBounds = i >= 0 && i < 4 && j >= 0 && j < 4;
                boolean isSelf = i == row && j == col;
                if (inBounds && !isSelf) {
                    node.addNeighbor(board[i][j]);
                }
            }
        }
    }

    private char rollDie(boolean[] diceUsed) {
        Random rand = new Random();
        int dieToTry = rand.nextInt(16);

        if (!diceUsed[dieToTry]) {
            diceUsed[dieToTry] = true;
            return Character.toUpperCase(dice[dieToTry].charAt(rand.nextInt(6)));
        }
        else return Character.MIN_VALUE; //indicated failure to set
    }
}
