import java.util.*;

public class Node {
    //fields
    private char letter;
    private int indexOfNextChild;
    private ArrayList<Node> children;
    private ArrayList<Node> visitedChildren;
    private int[] pos = {-1, -1};

    public Node (char letter) {
        this.letter = letter;
        children = new ArrayList<>();
        indexOfNextChild = 0;
    }

    public Node (char letter, int row, int col) {
        this.letter = letter;
        children = new ArrayList<>();
        indexOfNextChild = 0;
        pos[0] = row;
        pos[1] = col;
        visitedChildren = new ArrayList<>();
    }
    
    public int[] getPos() {
        return pos;
    }

    public void visitChild(Node node) {
        if (children.contains(node)) {
            visitedChildren.add(node);
        }
        else System.out.println("Not a child!");
    }

    public ArrayList<Node> unvisitedChildren() {
        ArrayList<Node> unvisited = new ArrayList<>();
        for (Node el : children) {
            if (visitedChildren.contains(el)) {
                unvisited.add(el);
            }
        }
        return unvisited;
    }

    public char getChar() {
        return letter;
    }

    public Node getNextChild() {
        if (indexOfNextChild >= 0 && indexOfNextChild < children.size()) {
            return children.get(indexOfNextChild);
        }
        else {
            System.out.println("Error! Bad operand passed to node.getNextChild()");
            return null;
        }
    }

    public boolean incChildIndex() {
        if (indexOfNextChild < 7 &&
                children.get(indexOfNextChild + 1) != null) {
            indexOfNextChild++;
            return true;
        }
        return false;
    }

    public boolean hasNextChild() {
        if (children.get(indexOfNextChild + 1) != null) {
            return true;
        }
        return false;
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "[" + this.letter + "]";
    }
}
