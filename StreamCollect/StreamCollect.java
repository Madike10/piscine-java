package StreamCollect;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
         return s.collect(Collectors.groupingBy(
             str -> (Character) Character.toUpperCase(str.charAt(0))
         ));
     }
    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
         return s.collect(Collectors.groupingBy(
                   num -> num % 4,
                   Collectors.maxBy(Integer::compare)
         ));
    }
    public static String orderAndConcatWithSharp(Stream<String> s) {
         return s.sorted()
               .collect(Collectors.joining(" # ", "{", "}"));
    }
}
