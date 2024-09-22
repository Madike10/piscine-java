import java.util.ArrayList;
import java.util.List;

public class ValuePublisher {

    private List<NumericBaseObserver> observers = new ArrayList<>();

    // Method to update all observers with the new state
    public void updateState(int value) {
        for (NumericBaseObserver observer : observers) {
            observer.updateState(value);
        }
    }

    // Method to add a new observer
    public void subscribe(NumericBaseObserver observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    public void unsubscribe(NumericBaseObserver observer) {
        observers.remove(observer);
    }
}
