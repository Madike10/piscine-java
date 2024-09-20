public class CarDriver extends Driver {
    @Override
    public Transport createTransport() {
        return TransportFactory.getTransport("Car");
    }
}
