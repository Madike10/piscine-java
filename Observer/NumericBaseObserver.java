import java.util.List;

public interface NumericBaseObserver {
    void updateState(int state);
    List<String> getEvents();
}
