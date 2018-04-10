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

    public Node getNode(int row, int col) {
        return board[row][col];
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

    private void setNodeChildren(int row, int col) {
        int nodesSet = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                try {
                    if(!board[row][col].getChildren().contains(board[row][col])
                            && (i != row || j != col)) {
                        board[row][col].addChild(board[i][j]);
                    }
                }
                catch(ArrayIndexOutOfBoundsException e) {}
            }
        }
    }

    private Node[][] getBoard() {
        return board;
    }

    public static void main(String[] args) {
        BoggBoard board = new BoggBoard();
        board.print();
        ArrayList<ArrayList<LinkedList<Node>>> allTrees = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board.setNodeChildren(i, j);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                allTrees.add(board.getNode(i,j).getTree());
            }
        }

        for (Node[] row : board.getBoard()) {
            for (Node el : row) {
                el.print();
            }
        }

        for (ArrayList el : allTrees) {
            for (LinkedList path : el) {
                for (Node node : path) {
                    System.out.print(node.getChar());
                }
            }
        }
    }
}
