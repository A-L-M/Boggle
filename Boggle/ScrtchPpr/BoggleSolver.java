/*************************
 * Testing an idea for
 * Boggle word validation
 *
 * Try to solve a given
 * Boggle board
 ************************/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class BoggleSolver {
    //fields
    private TreeSet<String> words = new TreeSet<>();
    private ArrayList<String> validStrings;
    
    //constructors
    public BoggleSolver(File dict) {
        validStrings = new ArrayList<>();
        //checking file exists
        Scanner scanner;
        try {
            scanner = new Scanner(dict);
        }
        catch (IOException e) {
            System.out.println("Oops! You're missing parts! Please redownload" +
                    " the application.");
            //there must be a better way than this. . . FIXME
            scanner = new Scanner(System.in);
        }
        //initializing TreeSet words
        int i=  0;
        while(scanner.hasNextLine()) {
            words.add(scanner.nextLine());
            i++;
        }
    }
    //methohds

    //This method should be responsible for finding possible words given the list of
    //16-character long strings that are valid (i.e. pathing is already done)
    private String[] solve(Board board) {
        return null;//FIXME
    }

    //attempting to solve just one given starting point
    private String onePath(Board board, int x, int y) {
        //adding first letter
        boolean[][] visited = new boolean[4][4];
        StringBuilder onePath = new StringBuilder();
        onePath.append(board.getLetter(x, y));
        visited[x][y] = true;

        for (int i = x - 1; i <= x + 1; i++) {
            for(int j = y - 1; j <= y + 1; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    onePath.append(board.getLetter(i, j));
                }
            }
        }
        return onePath.toString();//FIXME
    }

    //for testing
    public static void main(String[] args) {
        Board board = new Board(4);
        File dict = new File("nursery-dict.txt");
        BoggleSolver solver = new BoggleSolver(dict);
        System.out.println(solver.solve(board));

        board.print();

        Node firstLetter = new Node(null, board.getLetter(0,0));
        System.out.print(firstLetter.getCharValue());
        
        boolean[][] visited = new boolean[4][4];
        visited[0][0] = true;

        //testing ability to make one path
        /*
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    firstLetter.addChild(new Node(firstLetter,
                                board.getLetter(i,j)));
                }
            }
        }

        System.out.print(firstLetter.getCharValue());
        for (Node el : firstLetter.getChildren()) {
            System.out.print(el.getCharValue());
        }
        */

        //try multiple paths
        Stack<Node> pathing = new Stack<>();
        pathing.push(firstLetter);

        boolean isFinished = false;
        while(!isFinished) {
            pathing.push(
        }
    }
    static class Node {
        private char charValue;
        private Node parent;
        private LinkedList<Node> children;
        private boolean isRoot;

        public Node(Node parent, char charValue) {
            if (parent == null) {
                isRoot = true;
            }
            else isRoot = false;

            this.charValue = charValue;
            children = new LinkedList<>();
        }

        public Node getParent() {
            return parent;
        }

        public boolean isRoot() {
            if (isRoot) {
                return true;
            }
            else return false;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public void setCharValue(char charValue) {
            this.charValue = charValue;
        }

        public char getCharValue() {
            return charValue;
        }

        public void addChild(Node child) {
            children.add(child);
        }

        public LinkedList<Node> getChildren() {
            return children;
        }
    }
}









