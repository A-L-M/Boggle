/**************************
 * Author Alec Mills
 *
 * Represents one space on
 * a boggle board
 ************************/

import java.util.ArrayList;

public class Node {

    private char letter;
    private ArrayList<Node> children;//adjacent nodes
    private int[] pos = {-1, -1}; //position in board[][]

    //FIXME
    //generate Node without setting pos for debugging
    public Node(char letter) {
        this.letter = letter;
        children = new ArrayList<>();
    }

    public Node(char letter, int row, int col) {
        this.letter = letter;
        children = new ArrayList<>();
        pos[0] = row;
        pos[1] = col;
    }

    //FIXME debugging
    /*
    public void setChar(char letter) {
        this.letter = letter;
    }
    */

    //adds adjacent node to list of adjacent  nodes
    public void addChild(Node child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return "[" + letter + "]";
    }

    //getters
    public ArrayList<Node> getChildren() {
        return children;
    }

    public Node getChild(int index) {
        boolean inBounds = ((index >= 0) && (index < children.size()));
        if (inBounds) {
            return children.get(index);
        }
        else return null; //FIXME 
    }

    public int getRow() {
        //check for -1?
        return pos[0];
    }

    public int getCol() {
        //check for -1?
        return pos[1];
    }

    public char getChar() {
        return letter;
    }
}
