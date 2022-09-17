/*

Arthur Tan
CIS36A
Expanding Diamond Assignment
9-6-22

 */
import objectdraw.Line;
import objectdraw.Location;
import objectdraw.WindowController;
import java.awt.*;

public class ExpandingDiamond extends WindowController {
    public static final int SIZE = 600;
    public static final int MOVE_LEFT = -10;
    public static final int MOVE_RIGHT = 10;
    public static final int MOVE_UP = -10;
    public static final int MOVE_DOWN = 10;
    private Line line1, line2, line3, line4;

    int counter = 0;
    public void onMousePress(Location point){
        line1.move(MOVE_LEFT,MOVE_UP);
        line2.move(MOVE_RIGHT,MOVE_UP);
        line3.move(MOVE_RIGHT,MOVE_DOWN);
        line4.move(MOVE_LEFT,MOVE_DOWN);
    }
    public static void main(String[] args) {
        new ExpandingDiamond().startController(SIZE,SIZE);
    }
    public void begin(){
        line1 = new Line(0,(SIZE/2),(SIZE/2),0,canvas);
        line2 = new Line((SIZE/2),0,SIZE,(SIZE/2),canvas);
        line3 = new Line(SIZE,(SIZE/2),(SIZE/2),SIZE,canvas);
        line4 = new Line((SIZE/2),SIZE,0,(SIZE/2),canvas);
    }
}