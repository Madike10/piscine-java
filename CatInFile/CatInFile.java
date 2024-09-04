package CatInFile;
import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Usage: java CatInFile <filename>");
            return;
        }

        String filename = args[0];
        FileOutputStream fileOutputStream = null;
        InputStream inputStream = System.in;

        try {
            fileOutputStream = new FileOutputStream(filename);
            byte[] buffer = new byte[1024]; // Buffer size of 1024 bytes
            int bytesRead;

            // Read from standard input and write to the file
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}
