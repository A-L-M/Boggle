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

class Board {
    //each element represents one of 16 dice included in Boggle, each char in
    //String element a face of the die
    private final String[] dice = {"aaeegn","elrtty","aoottw","abbjoo","ehrtvw",
            "cimotu","disstty","eiosst","delvry","achops","himnqu","eeinsu",
            "eeghnw","affkps","hlnnrz","deilrx"};
    public Hashtable<String, Boolean> dictionary; //represents set of valid words
    private Node[][] board; //represents physical boggle board with dice set

    public Board(File dict) {
        this.dictionary = makeDict(dict);
        board = new Node[4][4];

        //making sure any single String in dice only ges used once
        boolean[] diceUsed = new boolean[16];
        for (int i = 0; i < 4; i++) {
            setRow(i, diceUsed);
        }

        //add list of adjacent nodes to each node
        for (Node[] row : board) {
            for (Node node : row) {
                setChildren(node);
            }
        }
    }

    //FIXME Debugging method
    /*
    public void insertWord (String word) {
        for (int i = 0; i < 4; i++) {
            board[0][i].setChar(word.charAt(i));
        }
        board[1][3].setChar(word.charAt(4));
    }
    */

    
    //getters
    public Node getNode(int row, int col) {
        return board[row][col];
    }

    public Node[][] getBoard() {
        return board;
    }

    public Hashtable<String, Boolean> getDict() {
        return dictionary;
    }

    //constructor helpers

    //fills one row of board[][] with instantiated Node objects
    private void setRow(int row, boolean[] diceUsed) {
        Random rand = new Random();
        int slotsSet = 0;

        while (slotsSet < 4) {
            char toTry = setSlot(diceUsed);
            if (toTry != Character.MIN_VALUE) {
                board[row][slotsSet] = new Node(toTry, row, slotsSet);
                slotsSet++;
            }
        }
    }

    //randomly selects an element of String[] dice and then randomly selects one
    //char in that element. Checks if the die it attempts to use has been used before and
    //if so returns Character.MIN_VALUE
    private char setSlot(boolean[] diceUsed) {
        Random rand = new Random(); 
        int toTry = rand.nextInt(16);

        if (!diceUsed[toTry]) {
            diceUsed[toTry] = true;
            return Character.toUpperCase(dice[toTry].charAt(rand.nextInt(6)));
        }
        return Character.MIN_VALUE;//indicates failed to set
    }

    //instantiates each nodes list of 'children' i.e. adjacent nodes
    private void setChildren(Node node) {
        int nodesSet= 0;
        int row = node.getRow();
        int col = node.getCol();
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                boolean inBounds = ((i >= 0 && i < 4) && (j >= 0 && j < 4));
                boolean isSelf = (i == row && j == col);
                if (inBounds && !isSelf) {
                    node.addChild(board[i][j]);
                }
            }
        }
    }

    //generates Hashtable of valid words from file w/ list of words
    private Hashtable<String, Boolean> makeDict(File file) {
        try {
            Scanner input = new Scanner(file);
            //size will be 263,790 using yawl.txt.trim
            Hashtable<String, Boolean> dict = new Hashtable<>(263789,0.1f);
            while (input.hasNextLine()) {
                String next = input.nextLine();
                if (next.length() >= 3) {
                    dict.put(next, Boolean.TRUE);
                }
            }
            return dict;
        }
        catch(FileNotFoundException e) {
            System.out.println("Oops! No dictionary found, please provide one.");
            return null;
        }
    }

    //FIXME
    //debugging method, not critical
    public void print() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Node node = getNode(i, j);
                System.out.print(node.toString());
                if (j % 3 == 0 && j != 0) {
                    System.out.println();//new row
                }
            }
        }
    }
}
