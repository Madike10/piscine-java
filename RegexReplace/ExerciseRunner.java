package RegexReplace;

import java.io.IOException;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        System.out.println(RegexReplace.removeUnits("32cm et 50€"));
        System.out.println(RegexReplace.removeUnits("32 cm et 50 €"));
        System.out.println(RegexReplace.removeUnits("32cms et 50€!"));
        
        System.out.println(RegexReplace.obfuscateEmail("john.doe@example.com"));
        System.out.println(RegexReplace.obfuscateEmail("jann@example.co.org"));
        System.out.println(RegexReplace.obfuscateEmail("jackob@example.fr"));
    }
}
