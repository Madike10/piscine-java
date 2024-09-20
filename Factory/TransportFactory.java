

public class TransportFactory {
    public static Transport getTransport(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("Plane")) {
            return new Plane();
        } else {
            throw new IllegalArgumentException("Invalid transport type");
        }
    }
}
