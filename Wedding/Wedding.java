import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Wedding {

    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        List<String> firstList = new ArrayList<>(first);
        List<String> secondList = new ArrayList<>(second);

        Random random = new Random();
        Map<String, String> couples = new HashMap<>(); 

        int size = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < size; i++) {
            String nameFromFirst = firstList.remove(random.nextInt(firstList.size()));
            String nameFromSecond = secondList.remove(random.nextInt(secondList.size()));
            couples.put(nameFromFirst, nameFromSecond);
        }

        return couples;
    }
}
