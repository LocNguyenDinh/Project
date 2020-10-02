package Fan;

public class Fan {
    private final static int SLOW = 1;
    private final static int MEDIUM = 2;
    private final static int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Speed: " + getSpeed() + ",radius: " + getRadius() + ", color: " + getColor() + ", status: " + (isOn() ? "On" : "Off");
    }
}
