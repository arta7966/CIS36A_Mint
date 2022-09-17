/*

Arthur Tan
CIS36A
Random Circles Assignment
9-8-22

 */

import objectdraw.WindowController;
import objectdraw.Location;
import objectdraw.FilledOval;
import java.awt.*;

public class RandomCircles extends WindowController {
    public static final int SIZE = 700;

    public void onMousePress(Location point){

        for (int i = 0; i < 50; i++) {

            int circleSize = (int) (Math.random() * (100 - 10 + 1) + 10);
            int xLocation = (int) (Math.random() * (SIZE - circleSize));
            int yLocation = (int) (Math.random() * (SIZE - circleSize));
            int colorR = (int) (Math.random() * 255);
            int colorG = (int) (Math.random() * 255);
            int colorB = (int) (Math.random() * 255);
            drawCircles(xLocation, yLocation, circleSize, colorR, colorG, colorB);
        }
    }

    public static void main(String[] args) {
        new RandomCircles().startController(SIZE,SIZE);
    }

    public void begin(){
    }
    public void drawCircles(int xLocation,int yLocation,int circleSize,int colorR, int colorG, int colorB){
        new FilledOval(xLocation,yLocation,circleSize,circleSize, new Color(colorR,colorG,colorB),canvas);
    }
}