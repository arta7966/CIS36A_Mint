public class RectangleClient {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(-30,-20);

        rect1.setWidth(60);
        rect1.setHeight(20);
        System.out.println("Width=" + rect1.getWidth());
        System.out.println("Height=" + rect1.getHeight());
        System.out.println("Perimeter=" + rect1.getPerimeter());
        System.out.println("Area=" + rect1.getArea());

        System.out.println("Width=" + rect2.getWidth());
        System.out.println("Height=" + rect2.getHeight());
        System.out.println("Perimeter=" + rect2.getPerimeter());
        System.out.println("Area=" + rect2.getArea());
    }

}
