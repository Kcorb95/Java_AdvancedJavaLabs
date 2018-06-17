public class Fan {
    final short SLOW = 1;
    final short MEDIUM = 2;
    final short FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    public Fan() {
        setSpeed(SLOW);
        setOn(false);
        setRadius(5);
        setColor("blue");
    }

    public Fan(int speed, boolean on, double radius, String color) {

        setSpeed(speed);
        setOn(on);
        setRadius(radius);
        setColor(color);
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

    @Override
    public String toString() {
        final String output;
        if (on) {
            output = "A " + getRadius() + " inch " + getColor() + " fan at a speed of " + getSpeed();
        } else {
            output = "A " + getRadius() + " inch " + getColor() + " fan; fan is off";
        }
        return output;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10.0, "yellow");
        Fan fan2 = new Fan(9000, false, 5.0, "blue");
        System.out.println(fan1 + "\n" + fan2);
    }
}
