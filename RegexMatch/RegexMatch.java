package RegexMatch;

public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
         return (s == null) ? false : s.matches("[a-zA-Z]+");
    }
    
    public static boolean startWithLetterAndEndWithNumber(String s) {
         return (s == null) ? false : s.matches("^[a-zA-Z].*[0-9]$");
    }
    
    public static boolean containsAtLeast3SuccessiveA(String s) {
         return (s == null) ? false : s.matches(".*A{3,}.*");
    }
}
