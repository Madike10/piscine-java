
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {

    // Function to create a file with the specified content
    public static void createFile(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }

    // Function to retrieve and return the content of the specified file
    public static String getContentFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    // Function to delete the specified file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }

    // For testing purposes
    public static void main(String[] args) {
        try {
            // Create a file
            createFile("example.txt", "This is a sample text.");
            System.out.println("File created successfully.");

            // Get content from the file
            String content = getContentFile("example.txt");
            System.out.println("File content: " + content);

            // Delete the file
            deleteFile("example.txt");
            System.out.println("File deleted successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
