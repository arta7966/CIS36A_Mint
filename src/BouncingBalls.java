/*

Arthur Tan
CIS36A
Bouncing Balls Assignment
BouncingBalls.java
9-12-22

 */

import objectdraw.*;
import java.awt.*;
import java.util.Random;

public class BouncingBalls extends ActiveObject {
    private final FilledOval ball;
    private final DrawingCanvas canvas;

    public BouncingBalls(Location startPoint, DrawingCanvas canvas){
        Random rgn = new Random();
        int circleSize = rgn.nextInt(10,81);

        int colorR = rgn.nextInt(256);
        int colorG = rgn.nextInt(256);
        int colorB = rgn.nextInt(256);

        this.canvas = canvas;

        ball = new FilledOval(startPoint, circleSize, circleSize, new Color(colorR,colorG,colorB), canvas);
        start();
    }

    public void run(){
        Random rgn = new Random();

        int xSpeed = rgn.nextInt(2,11);
        int ySpeed = rgn.nextInt(2,11);
        int xDirection = rgn.nextInt(0,2);
        int yDirection = rgn.nextInt(0,2);

        if (xDirection == 0){
            xDirection = -1;
        }else
        {
            xDirection = 1;
        }

        if (yDirection == 0){
            yDirection = -1;
        }else
        {
            yDirection = 1;
        }

        while (true){
            ball.move(xSpeed*xDirection, ySpeed*yDirection);
            pause(5);

            if(ball.getX() <= 0){
                xDirection=1;
            }
            if((ball.getX() + ball.getWidth()) >= canvas.getWidth()){
                xDirection = -1;
            }
            if(ball.getY() <= 0){
                yDirection=1;
            }
            if((ball.getY() + ball.getHeight()) >= canvas.getHeight()){
                yDirection = -1;
            }
        }
    }
}
