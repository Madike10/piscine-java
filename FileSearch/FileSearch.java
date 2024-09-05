// package FileSearch;

import java.io.File;

public class FileSearch {

    public static String searchFile(String fileName) {
        // Start searching from the "documents" directory in the current working directory
        File rootDir = new File("documents");

        // Use a helper method to perform a recursive search
        return searchFileRecursively(rootDir, fileName);
    }

    private static String searchFileRecursively(File dir, String fileName) {
        // List all files and directories in the current directory
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // Recursively search in subdirectories
                    String result = searchFileRecursively(file, fileName);
                    if (result != null) {
                        return result;
                    }
                } else if (file.getName().equals(fileName)) {
                    // If the file is found, return the path
                    return file.getPath();
                }
            }
        }
        // If the file is not found, return null
        return null;
    }
}