package Comparator;

import java.util.Comparator;

public class ComparatorCircle implements Comparator<Circle> {
    @Override
    public int compare(Circle t1, Circle t2) {
        if (t1.getRadius() > t2.getRadius()) return 1;
        else if (t1.getRadius() < t2.getRadius()) return -1;
        else return 0;
    }
}
