package Comparator;

import java.util.Comparator;

public class ComparatorRectangle implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle t1, Rectangle t2) {
        if (t1.getPerimeter() > t2.getPerimeter()) return 1;
        else if (t1.getPerimeter() < t2.getPerimeter()) return -1;
        else return 0;
    }
}
