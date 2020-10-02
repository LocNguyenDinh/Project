package Rectangle;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(4, 40);
        rectangles[1] = new Rectangle(3.5, 35.9);

        for (Rectangle rec : rectangles) {
            System.out.println("A rectangle with width: " + rec.getWidth() + ",height: " + rec.getHeight()
                    + ",perimeter: " + rec.getPerimeter() + ",Area: " + rec.getArea());
        }
    }
}
