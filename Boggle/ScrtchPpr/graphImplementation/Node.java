import java.util.*;

public class Node {
    //fields
    char letter;
    private Node parent;
    private ArrayList<Node> children;
    private ArrayList<Node> visitedChildren;

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
    
    public ArrayList<Node> getChildren() {
        return children;
    }

    public ArrayList<Node> getVisited() {
        return visitedChildren;
    }

    public ArrayList<Node> getUnvisited() {
        ArrayList<Node> unVisited = new ArrayList<>();
        for (Node el : children) {
            if (!vistedChildren.contains(el)) {
                unVisited.add(el);
            }
        }
    }

    public void setParent() {
        this.parent = parent;
    }
    
    public void addChild(Node child) {
        children.add(child);
    }

    public void setParent(Node parent) {
        this.parent = parent;
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

    //trying just getting one path from a root
    public Stack<Node> getPathAt(Node root, int index) {
        boolean[] visitedChildren = new boolean[8];
        Stack<Node> path = new Stack<>();

        while (true) { //FIXME so it compiles
            Node childToTry = root.getChildren().get(index);
            if (!visitedChildren[index]) {
                path.push(root);
                path.push(childToTry);
                visitedChildren[index] = true;
            }
        }
    }
    public ArrayList<LinkedList<Node>> getTree() {
        Stack<Node> tempPath = new Stack<>();
        ArrayList<LinkedList<Node>> tree = new ArrayList<>();
        Stack<Node> endPath = new Stack<>();
        Node current = this;
        tempPath.push(this);
        while(!tempPath.empty()) {
            current = tempPath.peek();
            if(!current.getUnvisitedChildren().isEmpty()) {
                tempPath.push(current.getUnvisitedChildren().get(0));
                current.addVisitedChild(tempPath.peek());
            }
            else {
                endPath.push(tempPath.pop());
            }
            if (endPath.size() == 16) {
                LinkedList<Node> temp = new LinkedList<>(endPath);
                tree.add(temp);
                endPath.removeAll(endPath);
            }
        }
        return tree;
    }
}
