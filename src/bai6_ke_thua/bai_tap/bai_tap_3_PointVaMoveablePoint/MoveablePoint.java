package bai6_ke_thua.bai_tap.bai_tap_3_PointVaMoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MoveablePoint(){

    }

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

//    public MoveablePoint move(){
//        getX()+=xSpeed;
//        getY()+=ySpeed;
//        return this;
//    }
    @Override
    public String toString() {
        return "MoveablePoint with xSpeed of "
                + getXSpeed()
                + ", and ySpeed: "
                + getYSpeed()
                + ", which is a subclass of "
                + super.toString();
    }
}
