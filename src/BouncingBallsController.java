/*

Arthur Tan
CIS36A
Bouncing Balls Assignment
BouncingBallsController.java
9-12-22

 */

import objectdraw.Location;
import objectdraw.Text;
import objectdraw.WindowController;
import java.util.Scanner;

public class BouncingBallsController extends WindowController {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input width of screen: ");
        int width = keyboard.nextInt();
        System.out.print("Please input height of screen: ");
        int height = keyboard.nextInt();
        BouncingBallsController newWindow = new BouncingBallsController();
        newWindow.startController(width,height,"Bouncing Balls");
    }

    public void begin() {
        new Text("Click anywhere on the screen to create a ball", 5, 20, canvas);
    }

    public void onMousePress(Location point){
        new BouncingBalls(point, canvas);
    }
}

