import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> change = new ArrayList<>();
        for (int coin : coins) {
            while (amount >= coin) {
                change.add(coin);
                amount -= coin;
            }
        }
        return change;
    }
}
