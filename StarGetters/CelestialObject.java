// package StarGetters;

public class CelestialObject{
    public double x;
    public double y;
    public double z;
    public String name;

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public String getName(){
        return name;
    }
    public void setX(double newX){
        this.x = newX;
    }
    public void setY(double newY){
        this.y = newY;
    }
    public void setZ(double newZ){
        this.z = newZ;
    }
    public void setName(String newName){
        this.name = newName;
    }
}