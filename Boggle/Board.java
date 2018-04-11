/*******************************
 * Author: Alec Mills
 *
 * Represents a Boggle board
 *******************************/

import java.util.*;//FIXME
import java.io.*;//FIXME

public class Board {
    //each element represents one of 16 dice included in Boggle, each char in
    //String element a face of the die
    private String[] dice = {"aaeegn","elrtty","aoottw","abbjoo","ehrtvw",
            "cimotu","disstty","eiosst","delvry","achops","himnqu","eeinsu",
            "eeghnw","affkps","hlnnrz","deilrx"};
    public Hashtable<String, Boolean> dictionary; //FIXME tracking down null pointers
    private Node[][] board;

    //TEST PASSED
    public Board(File dict) {
        this.dictionary = makeDict(dict);
        board = new Node[4][4];
        
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
    private void setRow(int row, boolean[] diceUsed) {
        Random rand = new Random();
        int slotsSet = 0;

        while (slotsSet < 4) {
            char toTry = setSlot(diceUsed);
            if (toTry != '0') {
                board[row][slotsSet] = new Node(toTry, row, slotsSet);
                slotsSet++;
            }
        }
    }

    private char setSlot(boolean[] diceUsed) {
        Random rand = new Random(); 
        int toTry = rand.nextInt(16);

        if (!diceUsed[toTry]) {
            diceUsed[toTry] = true;
            return Character.toUpperCase(dice[toTry].charAt(rand.nextInt(6)));
        }
        else return '0';//indicates failed to set
    }

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

    private Hashtable<String, Boolean> makeDict(File file) {
        try {
            Scanner input = new Scanner(new File("sowpodsTrimmed.txt"));
            //size will be 267,294 using sowpodsTrimmed.txt
            Hashtable<String, Boolean> dict = new Hashtable<>(267294,0.1f);
            while (input.hasNextLine()) {
                String next = input.nextLine();
                if (next.length() >= 3) {
                    dict.put(next, new Boolean(true));
                }
            }
            return dict;
        }
        catch(FileNotFoundException e) {
            System.out.println("Oops! No dictionary found, please provide one.");
            return null;
        }
    }
    //debugging
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
