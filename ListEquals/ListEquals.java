// package ListEquals;

import java.util.List;
public class ListEquals{
    public static Boolean areListsEqual(List<String> list1, List<String> list2){
        if ((list1 == null || list2 == null)  ){
            return false;
        }
        return list1.equals(list2);
    }
}