import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;

public class TestMainDevon {
    public static void main(String args[]) {
       Board board = new Board();

       IntroPage greeting = new IntroPage(board);
       greeting.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       greeting.setVisible(true);

       File dict = new File("yawl.txt.trim");
       Solver solver = new Solver();
       Trie root = new Trie(dict);

    }
}
