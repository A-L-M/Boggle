import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        File dict = new File("../Dictionaries/yawl.txt.trim");
        Board board = new Board(dict);
        board.print();
        Solver solver = new Solver();
        TrieNode root = new TrieNode(dict);//make our Trie out of a given dictionary file
        ArrayList<ArrayList<String>> solutions = new ArrayList<>();//words found on board

        System.out.println();//new line for formatting

        System.out.println("Found words: ");

        for (Space[] row : board.getBoard()) {
            for (Space el : row) {
                solver.solve(board.getSpace(el), root);
            }
        }
        for(String el : solver.foundWords) {
            if(el != null) {
                System.out.println(el);
            }
        }
    }
}  
