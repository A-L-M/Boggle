/***************************************
 * Author: Alec Mills & Devon Lee
 *
 * Represents a Boggle game board
 **************************************/

import java.util.Random;

public class Board {
    //fields
    private char[][] letters = new char[4][4];
    private char[][] easyValues = {{'A','A','E','E','G','N'},
            {'E','L','R','T','T','Y'},{'A','O','O','T','T','W'},
            {'A','B','B','J','O','O'},{'E','H','R','T','V','W'},
            {'C','I','M','O','T','U'},{'D','I','S','T','T','Y'},
            {'E','I','O','S','S','T'},{'D','E','L','V','R','Y'},
            {'A','C','H','O','P','S'},{'H','I','M','N','Q','U'},
            {'E','E','I','N','S','U'},{'E','E','G','H','N','W'},
            {'A','F','F','K','P','S'},{'H','L','N','N','R','Z'},
            {'D','E','I','L','R','X'}};
    private int size;

    //constructors
    public Board(int size) {
        this.size = size;
        Random rand = new Random();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                int die = rand.nextInt(16);
                int dieFace = rand.nextInt(6);
                letters[i][j] = easyValues[die][dieFace];
            }
        }
    }
    //methods
    public int size() {
        return size;
    }
    public char[][] getBoard() {
        return letters;
    }
    public char getLetter(int row, int col) {
        return letters[row][col];
    }
    //FIXME temporary tester method
    public void print() {
        for(char[] el : this.letters) {
            for(char let : el) {
                System.out.print("[" + let + "]");
            }
            System.out.println();//formatting
        }
    }
    //FIXME temporary test method
    public static void main (String[] args) {
        Board board = new Board(4);
        board.print();
    }
}
