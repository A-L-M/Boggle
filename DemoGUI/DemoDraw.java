/**********************************
* Author: Margret Posch
*
* Demo how to draw with StdDraw
**********************************/

import java.awt.Color;
import java.awt.Font;

public class DemoDraw {
   public static void main(String[] args) {
      //squares();
      demoImage();

   }  
   
   private static void demoImage() {
       StdDraw.setCanvasSize(600, 600);
       StdDraw.setScale(0, 600);
       
       StdDraw.picture(300, 300, "Images/Sky600.jpg");
       
       StdDraw.setPenColor(Color.ORANGE);
       StdDraw.filledCircle(375, 250, 75);

       StdDraw.picture(250, 250, "Images/Guy.png");
       
       Font font = new Font("Arial", Font.BOLD, 50);
       StdDraw.setFont(font);
       StdDraw.setPenColor(new Color(100,0,0));
       StdDraw.text(300, 500, "Hello World!");
       
         
   }
   
   private static void squares() {
      for(int i = 0; i < 10; i++) {
         for (int j = 0; j < 10; j++) {
            if (i % 2 != 0) {
               StdDraw.setPenColor(Color.ORANGE);
               StdDraw.filledSquare(0.1 * j + 0.05, 0.95 - 0.1*i, 0.04);
            }
            else {
               StdDraw.setPenColor(Color.BLUE);
               StdDraw.square(0.1 * j + 0.05, 0.95 - 0.1*i, 0.04);
            }
         }
      } 
   }

}  