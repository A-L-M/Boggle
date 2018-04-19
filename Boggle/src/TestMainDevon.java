import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;

public class TestMainDevon{
   public static void main(String args[]){
      File dict = new File("yawl.txt");
      Board board = new Board(dict);
      
      IntroPage greeting = new IntroPage(board);
      greeting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      greeting.setVisible(true);
   }
}