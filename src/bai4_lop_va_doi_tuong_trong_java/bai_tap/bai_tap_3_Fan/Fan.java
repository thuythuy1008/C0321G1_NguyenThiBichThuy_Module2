package bai4_lop_va_doi_tuong_trong_java.bai_tap.bai_tap_3_Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
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

    public boolean getOn() {
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
        if (this.on != false) {
            System.out.println("Fan is on");
            System.out.println("Speed is: " + speed + " Radius is: " + radius + " and Color is: " + color);
        } else {
            System.out.println("Fan is off");
            System.out.println("Radius is: " + radius + " and Color is: " + color);
        }
        return null;
    }
}
