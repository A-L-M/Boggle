import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;

public class TestMainDevon {
    public static void main(String args[]) {
       Board board = new Board();
       File dict = new File("yawl.txt");
       Trie root = new Trie(dict);
       Solver solver = new Solver(root);
         
       IntroPage greeting = new IntroPage(board, solver);
       greeting.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       greeting.setVisible(true);
       
       
       
       
    }
}
