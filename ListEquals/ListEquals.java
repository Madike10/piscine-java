// package ListEquals;

import java.util.List;
public class ListEquals{
    public static Boolean areListsEqual(List<String> list1, List<String> list2){
        if (list1 != null && list2 !=  null){

            return list1.equals(list2);
        }
        return false;
    }
}