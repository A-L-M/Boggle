/*************************
 * Author: Alec Mills
 *
 * test client for Boggle
 *************************/

import java.util.*;//FIXME
import java.io.*;//FIXME

public class Main {
    public static void main (String[] args) {
        //test constructor
        Board board = new Board(new File("nursery-dict.txt"));
        board.print();
        System.out.println();
        //test getNode() //PASSED
        //System.out.println(board.getNode(3, 3)); 
        //
        //test getChildren() & setChildren(); PASSED
        System.out.println("Printing each nodes children:");

        for (Node[] row : board.getBoard()) {
            for (Node node : row) {
                System.out.print(node.toString() + ":::");
                for (Node child: node.getChildren()) {
                    System.out.print(child.toString() + " ");
                }
                System.out.println();
            }
        }
        //testing solver constructor PASSED
        Solver solver = new Solver(board);
        //testing solver.isValid() PASSED
        System.out.println("found hello: " + solver.isValid("hello"));
        //testing solve on one row PASSSED
        for (String el : solver.solve(board.getNode(0,0))) {
            System.out.println(el + " ");
        }
        //testing solve on all nodes
        for (Node[] row : board.getBoard()) {
            for (Node node : row) {
                for (String el : solver.solve(board.getNode(node.getRow(),node.getCol()))) {
                    System.out.println(el + " ");
                }

            }
        }
    }
}
