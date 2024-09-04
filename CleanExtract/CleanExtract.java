public class CleanExtract {
    public static String extract(String s) {
        String[] substrings = s.split("\\|");
        StringBuilder result = new StringBuilder();

        for (String substring : substrings) {
            int firstDot = substring.indexOf('.');
            int lastDot = substring.lastIndexOf('.');

            if (firstDot != -1 && lastDot != -1) {
                String extracted = substring.substring(firstDot + 1, lastDot);
                if (!extracted.trim().isEmpty()) {
                    if (result.length() > 0) {
                        result.append(" ");
                    }
                    result.append(extracted.trim());
                }
            }
        }

        return result.toString();
    }
}
