// package StarStatic;


public class CelestialObject{
    public double x;
    public double y;
    public double z;
    public String name;
    public static final double KM_IN_ONE_AU = 150000000;

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
    public static double getDistanceBetween(CelestialObject obj1,   CelestialObject obj2){
        double dx = obj2.x - obj1.x ;
        double dy = obj2.y - obj1.y ;
        double dz = obj2.z - obj1.z ;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }
    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2){
        double distanceInM = getDistanceBetween(obj1, obj2);
        return distanceInM * KM_IN_ONE_AU;
    }
}