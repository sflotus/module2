package Exercices.ss6_inheritance_oop.Point2d_Point3d;

public class Point3D extends  Point2D{
    private  float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z=z;
    }
    public  float[] getXYZ(){
        float[] arr ={super.getX(),super.getY(),z};
        return arr;
    }
    public String toString(){
        return super.toString() + "\n" +
                "Z:" +this.z;
    }
}
