package Triangle;

public class Triangle {
    public static boolean isValid(double side1, double side2, double side3) {
        boolean result = false;
        if (side1 < (side2 + side3) && side2 < (side3 + side1) && side3 < (side1 + side2)) result = true;
        return result;
    }

    public static double area(double side1, double side2, double side3) {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        return area;
    }

    public static void main(String[] args) {
        double side1 = 4, side2 = 7, side3 = 8;

        System.out.println("side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + " is triangle: " + isValid(side1, side2, side3));
        System.out.println("Triangle area: " + area(side1, side2, side3));
    }


}
