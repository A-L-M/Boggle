import java.util.*;

public class Node {
    //fields
    char letter;
    Node parent;
    ArrayList<Node> children;
    ArrayList<Node> visitedChildren;

    //constructors
    public Node(char letter) {
        this.letter = toCaps(letter);
        children = new ArrayList<>();
        visitedChildren = new ArrayList<>();
    }

    public Node(char letter, Node parent) {
        this.letter = toCaps(letter);
        this.parent = parent;
        children = new ArrayList<>();
        visitedChildren = new ArrayList<>();
    }
    
    //methods
    public void setParent() {
        this.parent = parent;
    }
    
    public void addChild(Node child) {
        children.add(child);
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public char getChar() {
        return letter;
    }

    private char toCaps(char letter) {
        return Character.toUpperCase(letter);
    }

    private void addVisitedChild (Node node) {
        visitedChildren.add(node);
    }

    private ArrayList<Node> getUnvisitedChildren() {
        ArrayList<Node> unvisitedChildren = new ArrayList<>();
        for (Node el : children) {
            if (!visitedChildren.contains(el)) {
                unvisitedChildren.add(el);
            }
        }
        return unvisitedChildren;
    }

    @Override
    public String toString() {
        return "[" + letter + "]";
    }

    public void print() {
        System.out.println("Letter: " + letter);
        System.out.println("Children: ");
        for (Node el : children) {
            System.out.println(el);
        }
    }
}
