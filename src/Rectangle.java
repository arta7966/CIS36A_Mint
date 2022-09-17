/*

Arthur Tan
CIS36A
Rectangle Assignment
8-31-22

 */

public class Rectangle {

    private double width;
    private double height;

    // constructors

    public Rectangle() {
    }

    public Rectangle(double newWidth, double newHeight){

        if (newWidth > 0) {
            width = newWidth;
        } else {
            System.out.println("error! invalid width");
        }

        if (newHeight > 0) {
            height = newHeight;
        } else {
            System.out.println("error! invalid height");
        }
    }

    // mutators methods
    // width and height cannot be less than or equal to 0

    public void setWidth(double newWidth){
        if (newWidth > 0) {
            width = newWidth;
        } else {
            System.out.println("error! invalid width");
        }
    }

    public void setHeight(double newHeight){
        if (newHeight > 0) {
            height = newHeight;
        } else {
            System.out.println("error! invalid height");
        }
    }

    // accessors methods

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    // perimeter method

    public double getPerimeter(){
        return 2*(width+height);
    }

    // area method

    public double getArea(){

        return (width*height);
    }

}
