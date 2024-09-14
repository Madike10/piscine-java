// package ListEquals;

import java.util.List;
public class ListEquals{
    public static Boolean areListsEqual(List<String> list1, List<String> list2){
        if (list1 != null && list2 !=  null && !list1.isEmpty() && !list2.isEmpty()){
            return list1.equals(list2);
        }
        return false;
    }
}