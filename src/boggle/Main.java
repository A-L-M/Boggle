package boggle;

/*****************************************
 * Author: Devon Lee & Alec Mills
 *
 * Entry point and test-client for Boggle
 * game and Boggle-solver
 ****************************************/

import javax.swing.JFrame;
import java.io.File;

public class Main {
    public static void main(String args[]) {
        try {
            File dict = new File(args[0]);
            Trie root = new Trie(dict);

            Board board = new Board();
            Solver solver = new Solver(root);

            IntroPage greeting = new IntroPage(board, solver);
            greeting.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            greeting.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("File not found; please specify file " +
                    "path as argument. \n E.g.: $:java Main word-list.txt");
        }
    }
}
