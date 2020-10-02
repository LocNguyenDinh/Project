package Comparable;

public class ComparableRectangle extends Rectangle implements Comparable<Rectangle> {
    public ComparableRectangle() {
    }

    public ComparableRectangle(double weight, double height) {
        super(weight, height);
    }

    public ComparableRectangle(double weight, double height, String color, boolean filled) {
        super(weight, height, color, filled);
    }


    @Override
    public int compareTo(Rectangle o) {
        if (getPerimeter() > o.getPerimeter()) return 1;
        else if (getPerimeter() < o.getPerimeter()) return -1;
        else return 0;
    }
}
