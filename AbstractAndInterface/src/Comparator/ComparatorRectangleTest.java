package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorRectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(4, 5);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(2, 3, "blue", true);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Comparator comparator = new ComparatorRectangle();
        Arrays.sort(rectangles, comparator);

        System.out.println("After-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
