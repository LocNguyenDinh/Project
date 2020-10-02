package Location;

public class LocationTest {

    public static void main(String[] args) {
        double[][] a;
        Location locations = new Location();
        a = locations.inputLocation();
        locations.locateLargest(a);
    }
}
