import java.util.ArrayList;
import java.util.List;

public class HexaBaseObserver implements NumericBaseObserver {

    private List<String> events = new ArrayList<>();

    // Update the state by converting the value to hexadecimal and adding it to the list
    @Override
    public void updateState(int state) {
        events.add(Integer.toHexString(state));
    }

    // Return the list of hexadecimal events
    @Override
    public List<String> getEvents() {
        return events;
    }
}
