// package StarConstructors;

public class StarConstructorsRunner {

    public static void main(String[] args) {
        CelestialObject defaultStar = new CelestialObject();
        System.out.println(defaultStar.x);
        System.out.println(defaultStar.y);
        System.out.println(defaultStar.z);
        System.out.println(defaultStar.name);

        CelestialObject earth = new CelestialObject("Terre", 0.43, 0.98, 1.43);
        System.out.println(earth.x);
        System.out.println(earth.y);
        System.out.println(earth.z);
        System.out.println(earth.name);
    }
}
