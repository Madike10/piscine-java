package RegexReplace;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
    public static String removeUnits(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("(\\d+)(cm|€)(?=\\s|$)", "$1");
    }

    public static String obfuscateEmail(String s) {
        if (s == null) {
            return null;
        }

        Pattern pattern = Pattern.compile("(.+)@([^.]+)\\.([^.]+)(\\.(.+))?");
        Matcher matcher = pattern.matcher(s);

        if (matcher.matches()) {
            String username = matcher.group(1);
            // String secondLevelDomain = matcher.group(2);
            String topLevelDomain = matcher.group(3);
            String thirdLevelDomain = matcher.group(5);

            // Obfuscate username
            String obfuscatedUsername;
            if (username.contains(".") || username.contains("-") || username.contains("_")) {
                int lastSpecialChar = Math.max(Math.max(username.lastIndexOf('.'), username.lastIndexOf('-')), username.lastIndexOf('_'));
                obfuscatedUsername = username.substring(0, lastSpecialChar + 1) + "*".repeat(username.length() - lastSpecialChar - 1);
            } else if (username.length() > 3) {
                obfuscatedUsername = username.substring(0, 3) + "*".repeat(username.length() - 3);
            } else {
                obfuscatedUsername = username.charAt(0) + "*".repeat(username.length() - 1);
            }

            // Obfuscate domain
            String obfuscatedDomain;
            if (thirdLevelDomain != null) {
                obfuscatedDomain = "*******." + topLevelDomain + "." + "*".repeat(thirdLevelDomain.length());
            } else if (topLevelDomain.equals("com") || topLevelDomain.equals("org") || topLevelDomain.equals("net")) {
                obfuscatedDomain = "*******." + topLevelDomain;
            } else {
                obfuscatedDomain = "*******." + "*".repeat(topLevelDomain.length());
            }

            return obfuscatedUsername + "@" + obfuscatedDomain;
        }

        return s;
    }
}