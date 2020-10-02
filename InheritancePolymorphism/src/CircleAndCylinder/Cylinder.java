package CircleAndCylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(double height, double radius) {
        return (radius * radius * 3.14) * height;
    }

    public String toString() {
        return "A cylinder with radius: " + getRadius() + ", height: " + getHeight() + ", color: " + getColor() + ", area: " + getArea(getHeight(), getRadius());
    }
}
