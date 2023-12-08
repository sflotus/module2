package ss6_inheritance_oop.point2d_point3d;

public class Point2D {
    private float x;
    private float y;
    public Point2D(){

    }
    public Point2D(float x, float y) {
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
    public void setXY(float x, float y){
        this.x =x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arr ={x,y};
        return arr;
    }
    public String toString(){
        return "\n" +
                "X: " +this.x+"\n" +
                "Y: " +this.y;
    }
}
