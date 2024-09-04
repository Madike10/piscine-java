// package SortArgs;
import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        // Convert a String array to an int array
        int[] numbers = Arrays.stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        // Sort the int array
        Arrays.sort(numbers);

        // Print sorted numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
