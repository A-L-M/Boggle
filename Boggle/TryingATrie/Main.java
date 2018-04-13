import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Board board = new Board(new File("nursery-dict.txt.trim"));//FIXME get better dict
        board.print();
        Solver solver = new Solver();
        ArrayList<String> words = solver.solve(board.getSpace(0,0), board.getRoot());
        /*
        for(String el : words) {
            System.out.println(el);
        }
        */
    }
}
