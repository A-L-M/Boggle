/*************************
 * Testing an idea for
 * Boggle word validation
 *
 * Try to solve a given
 * Boggle board
 ************************/

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.TreeSet;
import java.util.ArrayList;

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
    private String[] solve(Board board) {
        char[][] letters = board.getBoard();
        int row = 0;
        int col = 0;
        int count = 0;
        while (row * col < board.size()) {
            char[] word = new char[Math.pow(board.size(), 2)];
            word[0] = board.getLetter(row,col)
            for (int i = row - 1; i < board.size(); i++) { 
                try {
                    letters[i][j];

            row++;
            col++;
        }
        return null;//FIXME
    }

    //for testing
    public static void main(String[] args) {
        Board board = new Board(4);
        File dict = new File("nursery-dict.txt");
        BoggleSolver solver = new BoggleSolver(dict);
        System.out.println(solver.solve(board));
    }
}
