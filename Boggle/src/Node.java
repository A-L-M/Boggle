import java.util.ArrayList;

class Node {
    public char value;
    private ArrayList<Node> neighbors;
    private int row;
    private int col;

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
        }
        else return null;

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
}
