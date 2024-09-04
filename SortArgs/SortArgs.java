// package SortArgs;

public class SortArgs {
    public static void sort(String[] args) {
        int[] sortedIndices = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            sortedIndices[i] = i;
        }

        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < args.length - 1; i++) {
                int j = sortedIndices[i];
                int k = sortedIndices[i + 1];
                if (Integer.parseInt(args[j]) > Integer.parseInt(args[k])) {
                    swapped = true;
                    sortedIndices[i] = k;
                    sortedIndices[i + 1] = j;
                }
            }
        } while (swapped);

        for (int i : sortedIndices) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}