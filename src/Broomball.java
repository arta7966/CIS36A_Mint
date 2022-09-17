/*

Arthur Tan
CIS36A
Bouncing Balls Assignment
Broomball.java
9-15-22

 */

import objectdraw.*;
import java.awt.*;
import java.util.Random;
public class Broomball extends WindowController {
    public static final int BROOM_WIDTH = 20;
    public static final int BROOM_HEIGHT = 20;
    public static final int TRASH_WIDTH = 100;
    public static final int TRASH_HEIGHT = 100;
    public static final int TRASH_CAN_WIDTH = 130;
    public static final int TRASH_CAN_HEIGHT = 160;
    private FilledOval broom;
    private FilledRect trash;
    private FilledRect trashCan;
    private Location broomPosition = new Location(50,50);
    private Location trashPosition;
    private Location trashCanPosition;

    public static void main(String[] args) {
    new Broomball().startController(800,600,"Broomball");
    }

    public void begin(){

        Random rng = new Random();
        trashPosition = new Location(rng.nextInt(BROOM_WIDTH+10,canvas.getWidth()-TRASH_WIDTH),rng.nextInt(51+BROOM_HEIGHT,canvas.getHeight()-TRASH_HEIGHT));
        trashCanPosition = new Location(rng.nextInt(0,canvas.getWidth()-TRASH_CAN_WIDTH),rng.nextInt(51,canvas.getHeight()-TRASH_CAN_HEIGHT));

        trashCan = new FilledRect(trashCanPosition,TRASH_CAN_WIDTH,TRASH_CAN_HEIGHT,Color.DARK_GRAY,canvas);
        trash = new FilledRect(trashPosition,TRASH_WIDTH,TRASH_HEIGHT, Color.PINK,canvas);
        broom = new FilledOval(broomPosition,BROOM_WIDTH,BROOM_HEIGHT,Color.BLUE,canvas);
        broom.hide();

        new FilledRect(0,0,50,50, Color.BLACK,canvas);
        new FilledRect(50,0,50,50,Color.RED,canvas);
        new FilledRect(100,0,50,50,Color.GREEN,canvas);
        new FilledRect(150,0,50,50,Color.BLUE,canvas);
    }

    public void onMouseClick(Location point){
        double xLocation = point.getX();
        double yLocation = point.getY();

        if (yLocation>=0 && yLocation<=50){
            if(xLocation <= 50){
                broom.setColor(Color.BLACK);
            } else if (xLocation > 50 && xLocation <= 100) {
                broom.setColor(Color.RED);
            } else if (xLocation > 100 && xLocation <= 150) {
                broom.setColor(Color.GREEN);
            } else if (xLocation > 150 && xLocation <= 200) {
                broom.setColor(Color.BLUE);
            }
        }
    }

    public void onMouseDrag(Location point){
        double xLocation = point.getX();
        double yLocation = point.getY();

        broom.moveTo(xLocation-BROOM_WIDTH/2,yLocation-BROOM_HEIGHT/2);
        broom.show();

        if (xLocation >= (trash.getX() - BROOM_WIDTH/2) && xLocation <= trash.getX() && yLocation >= trash.getY() && yLocation <= (trash.getY() + TRASH_HEIGHT)){
            trash.moveTo((xLocation + BROOM_WIDTH/2),trash.getY());
            broom.moveTo((xLocation - BROOM_WIDTH/2),(yLocation - BROOM_HEIGHT/2));
        }
        if (xLocation >= (trash.getX() + TRASH_WIDTH) && xLocation <= (trash.getX() + TRASH_WIDTH + BROOM_WIDTH/2) && yLocation >= trash.getY() && yLocation <= (trash.getY() + TRASH_HEIGHT)){
            trash.moveTo((xLocation - TRASH_WIDTH - BROOM_WIDTH/2),trash.getY());
            broom.moveTo((xLocation - BROOM_WIDTH/2),(yLocation - BROOM_HEIGHT/2));
        }
        if (xLocation >= trash.getX() && xLocation <= (trash.getX() + TRASH_WIDTH) && yLocation >= (trash.getY() - BROOM_WIDTH/2) && yLocation <= trash.getY()){
            trash.moveTo(trash.getX(),(yLocation + BROOM_WIDTH/2));
            broom.moveTo((xLocation - BROOM_WIDTH/2),(yLocation - BROOM_HEIGHT/2));
        }
        if (xLocation >= trash.getX() && xLocation <= (trash.getX() + TRASH_WIDTH) && yLocation >= (trash.getY() + TRASH_WIDTH) && yLocation <= (trash.getY() + TRASH_WIDTH + BROOM_WIDTH/2)){
            trash.moveTo(trash.getX(),(yLocation - TRASH_WIDTH - BROOM_WIDTH/2));
            broom.moveTo((xLocation - BROOM_WIDTH/2),(yLocation - BROOM_HEIGHT/2));
        }
        if(trash.getX() >= trashCan.getX() && (trash.getX() + TRASH_WIDTH) <= (trashCan.getX() + TRASH_CAN_WIDTH) && trash.getY() >= trashCan.getY() && (trash.getY() + TRASH_HEIGHT) <= (trashCan.getY() + TRASH_CAN_HEIGHT)){
            trash.removeFromCanvas();
            Toolkit.getDefaultToolkit().beep();

        }
    }
}
