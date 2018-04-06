/********************************
 * Author: Alec Mills
 *
 * Demo GUI using Class StdDraw
 *******************************/

public class DemoGUI {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(960, 540);
        StdDraw.picture(0.4, 0.4, "Images/background.jpeg"); //background

        StdDraw.picture(0.14, 0.58, "Images/noose.png", 0.4, 0.7); //background
    }
} 
