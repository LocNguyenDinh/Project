package FootAndMeter;

public class FootAndMeterMain {
    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }

    public static void main(String[] args) {
        double meter = 1.7;
        double foot = 3.87;

        System.out.println("Meter: " + meter + ", meter to foot: " + meterToFoot(meter));
        System.out.println("Foot: " + foot + ", foot to meter: " + footToMeter(foot));
    }

}
