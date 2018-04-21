/************************************************************
 * Author: Alec Mills & Devon Lee
 *
 * Generates ArrayList of Strings that are:
 * A) possible to be formed according to the rules of boggle
 * B) present in the given word-list, represented by a trie
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Boggle Movement rules:
 *  -no node may be used more than once per String
 *  -beginning with the first node chose, each
 *   subsequent node must be adjacent to the previous;
 *   up/down,left/right & diagonal are valid directions
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ************************************************************/ 

import java.util.ArrayList;
import java.util.Stack;
//FIXME imports only necessary for main() test method
import java.io.File;
import java.io.FileNotFoundException;

public class Solver {

    public ArrayList<String> foundWords = new ArrayList<>();
    //Stack tracks our position in both the board graph, and the trie graph
    Stack<Tuple> path = new Stack<>();

    public Solver() {
    }

    //Tuple allows us to simultaneously track our position in the board graph
    //as well as the trie
    private class Tuple {
        private Node node;
        private Trie trie;
        private int index = 0;
        private int row;
        private int col;

        public Tuple(Node node, Trie trie) {
            this.node = node;
            this.trie = trie;
            this.row = node.getRow();
            this.col = node.getCol();
        }
    }

    //returns score value of word based on word-length
    public int scoreWord(String word) {
        switch (word.length()) {
            case 3:
                return 1;
            case 4: case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 11;
            default: //very long words get more points
                return 18;
        }
    }

    public int scoreWordList(ArrayList<String> foundWords) {
        int totalScore = 0;
            for(String word : foundWords) {
                totalScore += scoreWord(word);
            }
        return totalScore;
    }

    //returns all legal-move valid strings beginning from one starting point
    public void solve(Node node, Trie root) {
        
        Node child;//used to point to the next adjacent node to our current node

        //first element on stack should always be a Tuple corresponding to
        //the boardnode passed as an argument, and the trie's root-node's child
        //corresponding to that board-node's letter value
        if (root.getChild(node.value) == null) {//covers rare case that no prefix in our tree begins with node.value
            return; 
        }
        Tuple current = path.push(new Tuple(node, root.getChild(node.value)));
        //when the stack pops off the final element, we know we have explored
        //all possible paths as far as necessary
        while (!path.isEmpty()) {
            //all Tuple operations in our loop will need to be performed on the
            //top element of the stack
            current = path.peek();
            //nodes with the value 'Q' should always be interpreted as a 'QU' sequence
            if (current.node.value == 'Q' && current.trie.getLetter() != 'U') {
                if (current.trie.getChild('U') != null) {
                    current.trie = current.trie.getChild('U');
                }
                else {
                    //covers rare case wherein we are at a Trie node
                    //that represents a prefix that contains Q
                    //but leads to a word that does not contain U
                    path.pop();//if Q doesn't have a U child, Q path should be terminated
                    continue; //avoid iterating index twice
                }
            }
            
            String word = current.trie.getWord();
            if (word != null && foundWords.indexOf(word) < 0) {
                foundWords.add(word);//if not null, we know we have a valid word
            }
            //check if current.index will refer to a valid child of current.node
            boolean inBounds = current.index >= 0 && 
                    current.index < current.node.allNeighbors().size();
            //if not, we can terminate this search path
            if (!inBounds) {
                path.pop();
                continue;
            }
            else {
                child = current.node.getNeighbor(current.index);
            }

            //if it is, check if that child is already an elemnt of the stack
            //in order to prevent infinite loops
            if (!inStack(child)) {
                //if its not, but the corresponding trie has no children corresponding
                //to the letter value, we know we can terminate that search path
                if (!current.trie.hasChild(child.value)) {
                    current.index++;
                    continue;//avoid iterating index twice
                }

                //otherwise, move to that position on the board graph and the
                //corresponding position on the trie
                path.push(new Tuple(child, current.trie.getChild(child.value)));

            }
            //before changing 'current to point to top stack element, iterate
            //its index so that next time we operate on current, it will not
            //repeat operations on an already visited child
            current.index++;
        }

    }

    //returns true if node is already present in the stack
    private boolean inStack (Node node) {
        for (Tuple el : path) {
            if (el.node == node) return true;
        }
        return false;
    }

    //example usage & algorithm demonsration
    public static void main (String[] args) {
            File file = new File(args[0]);
            Board board = new Board();

            for (Node[] row : board.getBoard()) {
                for (Node el : row) {
                    System.out.print("[" + el.value + "]");
                    if (el.getCol() == 3) System.out.println();
                }
                System.out.println();
            }

            Trie root = new Trie(file);
            Solver solver = new Solver();//FIXME debugging

            for (Node[] row : board.getBoard()) {
                for (Node el : row) {
                    solver.solve(el, root);
                }
            }

            for (String el : solver.foundWords) {
                System.out.println(el);
            }

            System.out.println("Total score: " + solver.scoreWordList(solver.foundWords));
    }
}
