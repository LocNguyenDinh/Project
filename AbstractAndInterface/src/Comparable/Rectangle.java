package Comparable;

public class Rectangle extends Shape {
    private double weight = 1.0;
    private double height = 1.0;

    public Rectangle() {

    }

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public Rectangle(double weight, double height, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return weight * height;
    }

    public double getPerimeter() {
        return (weight + height) * 2;
    }

    public String toString() {
        return "A Retangle with weight="
                + getWeight()
                + " height= " + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}
