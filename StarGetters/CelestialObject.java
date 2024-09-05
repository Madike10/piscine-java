// package StarGetters;

public class CelestialObject{
    public double x;
    public double y;
    public double z;
    public String name;

      // constructor
      public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    // constructor with parameters
    public CelestialObject(String newName, double newX, double newY, double newZ) {
        x = newX;
        y = newY;
        z = newZ;
        name = newName;
    }

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