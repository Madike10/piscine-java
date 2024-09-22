import java.util.ArrayList;
import java.util.List;

public class BinaryBaseObserver implements NumericBaseObserver {

    private List<String> events = new ArrayList<>();

    // Update the state by converting the value to binary and adding it to the list
    @Override
    public void updateState(int state) {
        events.add(Integer.toBinaryString(state));
    }

    // Return the list of binary events
    @Override
    public List<String> getEvents() {
        return events;
    }
}
