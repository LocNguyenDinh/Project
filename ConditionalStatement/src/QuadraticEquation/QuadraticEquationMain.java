package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static double delta(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public static double Root1(double a, double b, double c) {
        double delta = delta(a, b, c);
        double x1 = 0;
        if (delta == 0) {
            x1 = (-b / (2 * a));
        } else if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
        }
        return x1;
    }

    public static double Root2(double a, double b, double c) {
        double delta = delta(a, b, c);
        double x2 = 0;
        if (delta == 0) {
            x2 = (-b / (2 * a));
        } else if (delta > 0) {
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
        }
        return x2;
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation:");
        System.out.println("Input a:");
        a = scanner.nextDouble();
        System.out.println("Input b:");
        b = scanner.nextDouble();
        System.out.println("Input c:");
        c = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Quadratic Equation " + a + "x^2+" + b + "x+" + c + ": x=" + (-c / b));
        } else {
            if (Root2(a, b, c) == 0 || Root1(a, b, c) == 0) {
                System.out.println("Quadratic Equation " + a + "x^2+" + b + "x" + c + " has no solution");
            } else
                System.out.println("Quadratic Equation " + a + "x^2+" + b + "x" + c + ": " + "x1=" + Root1(a, b, c) + ",x2=" + Root2(a, b, c));
        }
    }
}
