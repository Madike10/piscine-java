import java.util.Map;

public class MapEquals {
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        if (map1 == null && map2 == null) {
            return true;
        }
        if (map1.isEmpty() && map2.isEmpty()) {
            return true;
        }
        if (map1 == null || map2 == null) {
            return false;
        }
        return map1.equals(map2);
    }
}
