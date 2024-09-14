import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        for (Integer s : set1) {
            if (!set2.contains(s)) {
                set2.add(s);
            }
        }
        return set2;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>();
        for (Integer s : set1) {
            if (set2.contains(s)) {
                intersection.add(s);
            }
        }
        return intersection;
    }
}
