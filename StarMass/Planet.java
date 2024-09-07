// package StarMass;

import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        centerStar  = new Star();
    }

    public Planet(String newName, double newX, double newY, double newZ, Star newCenterStar, int newMass) {
        super(newName, newX, newY, newZ, newMass);
        centerStar = newCenterStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star newCenterStar) {
        centerStar = newCenterStar;
    }

    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", this.name, centerStar.name, getDistanceBetween(this, centerStar) );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Planet)) {
            return false;
        }

        Planet other = (Planet) obj;
        return super.equals(obj) &&
                Objects.equals(this.centerStar, other.centerStar);
    }

    @Override

    public int hashCode() {
        return Objects.hash(super.hashCode(), centerStar);
    }

}