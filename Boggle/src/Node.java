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
<<<<<<< HEAD
        neighbors = new ArrayList<>();
=======
        neighbors = new ArrayList<>();            
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0
    }

    public void addNeighbor(Node neighbor) {
        neighbors.add(neighbor);
<<<<<<< HEAD
    }
=======
    } 
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0

    public Node getNeighbor(int index) {
        boolean inBounds = index >= 0 && index < neighbors.size();
        if (inBounds) {
            return neighbors.get(index);
<<<<<<< HEAD
        } else return null;
=======
        }
        else return null;
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0

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
