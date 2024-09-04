// package FileManager;

import java.io.*;
import java.nio.file.*;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }

    public static String getContentFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }
        // Supprime le dernier saut de ligne s'il existe
        if (content.length() > 0) {
            content.setLength(content.length() - System.lineSeparator().length());
        }
        return content.toString();
    }

        public static void deleteFile(String fileName) {
        try {
            Files.delete(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println("Erreur lors de la suppression du fichier : " + e.getMessage());
        }
    }
}