// package FileManager;

import java.io.*;
import java.nio.file.*;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name cannot be null or empty");
        }

        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            writer.write(content);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    // Function to retrieve and return the content of the specified file
    public static String getContentFile(String fileName) throws IOException {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name cannot be null or empty");
        }

        try {
            byte[] fileBytes = Files.readAllBytes(Paths.get(fileName));
            if (fileBytes.length == 0) {
                throw new IOException("File is empty");
            }
            return new String(fileBytes);
        } catch (NoSuchFileException e) {
            throw new IOException("File not found: " + fileName, e);
        }
    }

    // Function to delete the specified file
    public static void deleteFile(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name cannot be null or empty");
        }

        File file = new File(fileName);
        if (file.exists()) {
            if (!file.delete()) {
                System.err.println("Failed to delete the file: " + fileName);
            }
        } else {
            System.err.println("File does not exist: " + fileName);
        }
    }
}