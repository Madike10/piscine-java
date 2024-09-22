import java.util.ArrayList;
import java.util.List;

public class DecimalBaseObserver implements NumericBaseObserver {

    private List<String> events = new ArrayList<>();

    // Update the state by adding the decimal value as a string
    @Override
    public void updateState(int state) {
        events.add(Integer.toString(state));
    }

    // Return the list of decimal events
    @Override
    public List<String> getEvents() {
        return events;
    }
}
