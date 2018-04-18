import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {
    public static void main (String[] args) {
        //File dict = new File("../Dictionaries/yawl.txt.trim");
        File dict = new File("yawl.txt");
        Board board = new Board(dict);
        Solver solver = new Solver();
        Trie root = new Trie(dict);//make our Trie out of a given dictionary file
        System.out.println();//new line for formatting

        BoggleFrame game = new BoggleFrame(board);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
    }
}  
