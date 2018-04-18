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
    //each element of dice represents one of 16 dice included in Boggle
    //each char in String element a face of the die
    private final String[] dice = {"aaeegn","elrtty","aoottw","abbjoo","ehrtvw",
            "cimotu","disstty","eiosst","delvry","achops","himnqu","eeinsu",
            "eeghnw","affkps","hlnnrz","deilrx"};
    //represents the physical layout of the boggle board
    private final Node[][] board;
    private  Trie trieRoot;

    /*************************
     * new stuff double check
     ************************/
    public String playerName;
    private final char[] wordBox = new char[16];
    private int boxIndex = 0;

    //public String[] wordsFound = new String[50];

    public Board(File dict) {
        trieRoot = makeTrie(dict);

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
    /*FIXME debugging constructor 
    public Board(File dict, char[][] values) {
        trieRoot = makeTrie(dict);
        board = new Node[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = new Node(values[i][j], i, j);
            }
        }

        for (Node[] row : board) {
            for (Node el : row) {
                setNeighbors(el);
            }
        }
    }
    */

    //getters
    public  Trie getRoot() {
        return trieRoot;
    }

    public Node getNode(int row, int col) {
        return board[row][col];
    }

    public Node getNode(Node node) {
        for (Node[] row : board) {
            for (Node el : row) {
                if (el == node) return node;
            }
        }
        return null;
    }

    public Node[][] getBoard() {
        return board;
    }

    //constructor helper methods
    private  Trie makeTrie(File file) {
        return new Trie(file);
    }

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
