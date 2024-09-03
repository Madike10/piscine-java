// package StringContains;

public class StringContains{
    public static boolean isStringContainedIn(String subString, String s){
        if(s == null){
            return false;
        }
        return s.contains(subString);
    }
}