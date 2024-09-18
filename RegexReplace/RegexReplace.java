// package RegexReplace;

public class RegexReplace {
    public static String removeUnits(String s) {
        return (s == null) ? null : s.replaceAll("(?<=\\d+)s*(cm|€)(?!\\w)", "");
    }
    

    public static String obfuscateEmail(String s) {
        if (s == null) {
            return null;
        }
        System.out.println("*****"+ s);
    // private static String replaceBeforeThirdLetter(String s) {
    //     if (s == null || s.length() <= 2) {
    //         return s;
    //     }
    //     StringBuilder sb = new StringBuilder();
    //     sb.append(s.substring(0, 3));
    //     for (int i = 3; i < s.length(); i++) {
    //         sb.append('*');
    //     }
    //     return sb.toString();
    return s;
    }

}

