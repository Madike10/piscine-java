import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if(list.size() == 0) return null;
        List<Integer> newList = new ArrayList<Integer>(list);
        newList.sort(Integer::compareTo);
        return newList;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list.size() == 0) return null;
        List<Integer> newList = new ArrayList<Integer>(list);
        newList.sort(Integer::compareTo);
        Collections.reverse(newList);
        return newList;
    }
}
