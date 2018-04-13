/*******************************
 * Author: Alec Mills
 *
 * Represents a Boggle board
 *******************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class Board {
    //each element represents one of 16 dice included in Boggle, each char in
    //String element a face of the die
    private final String[] dice = {"aaeegn","elrtty","aoottw","abbjoo","ehrtvw",
            "cimotu","disstty","eiosst","delvry","achops","himnqu","eeinsu",
            "eeghnw","affkps","hlnnrz","deilrx"};
    private final Space[][] board;
    private TrieNode trieRoot;

    public Board(File dict) {
        trieRoot = makeTrie();

        boolean[] diceUsed = new boolean[16];
        board = new Space[4][4];
        for (int i = 0; i < board.length; i++) {
            setRow(i, diceUsed);
        }

        for (Space[] row : board) {
            for (Space el : row) {
                setNeighbors(el);
            }
        }
    }

    //getters
    public TrieNode getRoot() {
        return trieRoot;
    }

    public Space getSpace(int row, int col) {
        return board[row][col];
    }

    //constructor helper methods
    //FIXME implement file specification
    private TrieNode makeTrie() {
        return new TrieNode();
    }


    private void setRow(int row, boolean[] diceUsed) {
        Random rand = new Random();
        int slotsSet = 0;

        while (slotsSet < 4) {
            char toTry = rollDie(diceUsed);
            if (toTry != Character.MIN_VALUE) {
                board[row][slotsSet] = new Space(toTry, row, slotsSet);
                slotsSet++;
            }

        }
    } 

    public void setNeighbors(Space space) {
        int row = space.getRow();
        int col = space.getCol();
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                boolean inBounds = i >= 0 && i < 4 && j >= 0 && j < 4;
                boolean isSelf = i == row && j == col;
                if (inBounds && !isSelf) {
                    space.addNeighbor(board[i][j]);
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

    //FIXME debugging
    public void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print("[" + board[i][j].value + "]");
                if (j % 3 == 0 && j != 0) {
                    System.out.println();//new row
                }
            }
        }
    }

}
