package Comparable;

import java.util.Arrays;

public class ComparableRectangleTest {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = new ComparableRectangle[3];
        rectangles[0] = new ComparableRectangle(4, 5);
        rectangles[1] = new ComparableRectangle();
        rectangles[2] = new ComparableRectangle(6, 7, "red", false);

        System.out.println("Pre-sorted:");
        for (ComparableRectangle rec : rectangles) {
            System.out.println(rec);
        }
        Arrays.sort(rectangles);
        System.out.println("After-sorted:");
        for (ComparableRectangle re : rectangles) {
            System.out.println(re);
        }
    }
}
