package bai6_ke_thua.bai_tap.bai_tap_3_PointVaMoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Point with x of "
                + getX()
                + ", and y: "
                + getY();
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
    }
}
