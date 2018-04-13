import java.util.ArrayList;

class Space {
    public char value;
    private ArrayList<Space> neighbors;
    private int row;
    private int col;

    public Space(char value, int row, int col) {
        this.row = row;
        this.col = col;
        this.value = value;
        neighbors = new ArrayList<>();            
    }

    public void addNeighbor(Space neighbor) {
        neighbors.add(neighbor);
    } 

    public Space getNeighbor(int index) {
        boolean inBounds = index >= 0 && index < neighbors.size();
        if (inBounds) {
            return neighbors.get(index);
        }
        else return null;

    }

    public ArrayList<Space> allNeighbors() {
        return neighbors;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
