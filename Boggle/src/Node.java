/************************************************
 * Author: Alec Mills & Devon Lee
 *
 * Represents one node on the Boggle board graph
 ************************************************/

import java.util.ArrayList;

class Node {
    public final char value;//the char value of this node, i.e. the letter showing
    private final ArrayList<Node> neighbors;//list of adjacent nodes
    //below two fields store node's location on the Board
    private final int row;
    private final int col;

    public Node(char value, int row, int col) {
        this.row = row;
        this.col = col;
        this.value = value;
        neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node neighbor) {
        neighbors.add(neighbor);
    }

    public Node getNeighbor(int index) {
        boolean inBounds = index >= 0 && index < neighbors.size();
        if (inBounds) {
            return neighbors.get(index);
        } else return null;

    }

    public ArrayList<Node> allNeighbors() {
        return neighbors;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
