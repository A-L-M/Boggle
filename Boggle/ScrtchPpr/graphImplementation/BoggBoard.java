import java.util.*;
import java.io.*;

/*********************************************
 *               TO DO:
 *
 * fix 'setChildren' family of methods
*********************************************/

public class BoggBoard {
    //fields
    private boolean[][] adjacent; //FIXME currently not used
    private String[] dice = {"aaeegn","elrtty","aoottw","abbjoo","ehrtvw",
            "cimotu","disstty","eiosst","delrvy","achops","himnqu","eeinsu",
            "eeghnw","affkps","hlnnrz","deilrx"};
    private File dict;
    private boolean[] diceUsed = new boolean[16];
    private Node[][] board = new Node[4][4];

    //constructors
    public BoggBoard(File dict) {
        this.dict = dict;

        for (int i = 0; i < 4; i++) {
            setRow(i);
        }
    }
    //no dictionary provided for testing purposes FIXME
    public BoggBoard() {
        this.dict = dict;

        for (int i = 0; i < 4; i++) {
            setRow(i);
        }
    }

    //methods
    private char setBoardSlot(boolean[] diceUsed) {
        Random rand = new Random();
        int toTry = rand.nextInt(16);
        if (!diceUsed[toTry]) {
            diceUsed[toTry] = true;
            return dice[toTry].charAt(rand.nextInt(6)); 
        }
        else return '0';
    }

    private void setRow(int row) {
        Random rand = new Random();
        int slotsSet = 0;

        while (slotsSet < 4) {
            char toTry = setBoardSlot(diceUsed);
            if (toTry != '0') {
                board[row][slotsSet] = new Node(toTry);
                slotsSet++;
            } 
        }
    }

    private void print() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + board[i][j].getChar() + "]");
                if (j % 3 == 0 && j != 0) {
                    System.out.println();
                }
            }
        }
    }

    private void setChildren() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                setNodeChildren(i, j, board[i][j]);
            }
        }
    }
    private void setNodeChildren(int row, int col, Node node) {
        for (int i = row - 1; i < row + 1; i++) {
            for (int j = col - 1; j < col + 1; j++) {
                try {
                    if (board[i][j] != node) {
                        node.addChild(board[i][j]); 
                    }
                }
                catch(ArrayIndexOutOfBoundsException e) {} //do nothing
            }
        }
    }

    private Node[][] getBoard() {
        return board;
    }

    public static void main(String[] args) {
        BoggBoard board = new BoggBoard();
        board.print();

        board.setChildren();
        for (Node[] el : board.getBoard()) {
            for (Node node : el) {
                node.print();
            }
        }
    }
}
