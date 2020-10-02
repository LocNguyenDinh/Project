package CircleAndCylinder;

public class CylinderTest {

    public static void main(String[] args) {
        Cylinder[] cylinders = new Cylinder[3];
        cylinders[0] = new Cylinder();
        cylinders[1] = new Cylinder(3.0, 4.0);
        cylinders[2] = new Cylinder(3, 4, "red");

        for (Cylinder cy : cylinders) {
            System.out.println(cy);
        }
    }
}
