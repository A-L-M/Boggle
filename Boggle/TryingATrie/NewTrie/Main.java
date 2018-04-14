import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        File dict = new File("yawl.txt.trim");
        Board board = new Board(dict);
        board.print();
        Solver solver = new Solver();
        TrieNode root = new TrieNode(dict);
        ArrayList<ArrayList<String>> solutions = new ArrayList<>();

        /*FIXME DEBUGGING
        char[][] testValues = {
            {'A','L','E','Y'}, {'R','E','A','D'},
            {'R','A','T','S'}, {'R','A','I','N'}
        };
        Board board = new Board(new File("nursery-dict.txt.trim"), testValues);

        board.print();
        */

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
