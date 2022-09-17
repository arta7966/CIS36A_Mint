import objectdraw.*;
import java.awt.*;

public class HelloObjectdraw extends WindowController {
    public static final int SIZE = 600;

    public void begin(){

        new Line(0,0,SIZE,0,canvas);
        new Line(SIZE,0,SIZE,SIZE,canvas);
        new Line(SIZE,SIZE,0,SIZE,canvas);
        new Line(0,SIZE,0,0,canvas);

        new Line(0,SIZE/2,SIZE/2,0,canvas);
        new Line(SIZE/2,0,SIZE,SIZE/2,canvas);
        new Line(SIZE,SIZE/2,SIZE/2,SIZE,canvas);
        new Line(SIZE/2,SIZE,0,SIZE/2,canvas);

        new Line(.25*SIZE,.25*SIZE,.75*SIZE,.75*SIZE,canvas);
        new Line(.25*SIZE,.75*SIZE,.75*SIZE,.25*SIZE,canvas);

    }
    public static void main(String[] args) {
    new HelloObjectdraw().startController(SIZE,SIZE);
}
}
