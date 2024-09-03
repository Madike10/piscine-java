// package StringReplace;

public class StringReplace {
    public static String replace(String s, String target, String replacement) {
        if (s == null || target == null || replacement == null) {
            return s;
        }
        return s.replace(target, replacement);
    }
}
