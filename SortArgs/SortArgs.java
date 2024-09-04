// package SortArgs;
public class SortArgs {
    public static void sort(String[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = 0; j < args.length - i - 1; j++) {
                if (Integer.parseInt(args[j]) > Integer.parseInt(args[j + 1])) {
                    String temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }

        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}
