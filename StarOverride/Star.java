// package StarOverride;
import java.util.Objects;
public class Star extends CelestialObject {
    private double magnitude;

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double newMagnitude) {
        this.magnitude = newMagnitude;
    }

    public Star(){
        super();
        magnitude = 0.0;
    }

    public Star(String newName, double newX, double newY, double newZ, double newMagnitude) {
        super(newName, newX, newY, newZ);
        magnitude = newMagnitude;

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CelestialObject)) {
            return false;
        }

        Star other = (Star) obj;
        return Objects.equals(this.magnitude, other.magnitude);
    }

    public int hashCode() {
        return Objects.hash(magnitude);
    }
    

}