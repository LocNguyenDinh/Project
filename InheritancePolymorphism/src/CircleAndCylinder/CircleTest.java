package CircleAndCylinder;

public class CircleTest {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1.5);
        circles[1] = new Circle(1.3, "red");
        circles[2] = new Circle();

        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
