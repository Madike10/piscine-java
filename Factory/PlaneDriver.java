public class PlaneDriver extends Driver {
    @Override
    public Transport createTransport() {
        return TransportFactory.getTransport("Plane");
    }
}
