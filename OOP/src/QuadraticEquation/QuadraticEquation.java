package QuadraticEquation;

public class QuadraticEquation {
    double delta;
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) return 0;
        else if (getDiscriminant() == 0) return (-b / (2 * a));
        else return (-b - Math.pow(delta, 0.5)) / (2 * a);
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) return 0;
        else if (getDiscriminant() == 0) return (-b / (2 * a));
        else return (-b + Math.pow(delta, 0.5)) / (2 * a);
    }

    public String toString() {
        if (getRoot1() == 0) return "The equation has no roots";
        else
            return "Quadractic equation " + getA() + "x^2 + " + getB() + "x + " + getC() + ": x1=" + getRoot1() + " x2=" + getRoot2();
    }

}
