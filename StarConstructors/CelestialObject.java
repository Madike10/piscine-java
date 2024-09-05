// package StarConstructors;

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
}
