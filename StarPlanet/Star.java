// package StarPlanet;


import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double newMagnitude) {
        this.magnitude = newMagnitude;
    }

    public Star() {
        super();
        magnitude = 0.0;
    }

    public Star(String newName, double newX, double newY, double newZ, double newMagnitude) {
        super(newName, newX, newY, newZ);
        magnitude = newMagnitude;

    }
    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude",name, magnitude);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Star)) {
            return false;
        }

        Star other = (Star) obj;
        return super.equals(obj) &&
                Objects.equals(this.magnitude, other.magnitude);
    }

    @Override

    public int hashCode() {
        return Objects.hash(super.hashCode(), magnitude);
    }

}