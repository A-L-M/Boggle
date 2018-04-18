import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {
    public static void main (String[] args) {
        //File dict = new File("../Dictionaries/yawl.txt.trim");
        File dict = new File("yawl.txt");
        //Board board = new Board(dict);
        Solver solver = new Solver();
        Trie root = new Trie(dict);//make our Trie out of a given dictionary file
        System.out.println();//new line for formatting

//FIXME
        Node[][] array = {
            {new Node('Q', 0, 0), new Node('I', 0, 1), new Node('C', 0, 2), new Node('K', 0, 3)},
            {new Node('A', 0, 0), new Node('A', 0, 1), new Node('R', 0, 2), new Node('A', 0, 3)},
            {new Node('C', 0, 0), new Node('E', 0, 1), new Node('N', 0, 2), new Node('N', 0, 3)},
            {new Node('K', 0, 0), new Node('S', 0, 1), new Node('I', 0, 2), new Node('T', 0, 3)},
        };

        for (Node[] row : array) {
            for (int i = 0; i < 4; i++) {
                System.out.print(row[i]);
                solver.solve(row[i], root);
                if (i == 3) System.out.println();
            }
        }


        for (String el : solver.foundWords) {
            System.out.println(el);
        }
/*
        BoggleFrame game = new BoggleFrame(board);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        */
    }
}  
