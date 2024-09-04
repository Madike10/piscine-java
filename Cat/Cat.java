import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args == null || args.length == 0) {
            System.err.println("Error: No file specified");
            return;
        }

        for (String fileName : args) {
            try (FileInputStream fis = new FileInputStream(fileName);
                 BufferedInputStream bis = new BufferedInputStream(fis)) {

                byte[] buffer = new byte[4096]; // Taille du buffer de 4KB
                int bytesRead;

                while ((bytesRead = bis.read(buffer)) != -1) {
                    System.out.write(buffer, 0, bytesRead);
                }

                System.out.flush(); // Assurez-vous que tout est écrit dans la sortie standard

            } catch (FileNotFoundException e) {
                System.err.println("Error: File not found - " + fileName);
            } catch (IOException e) {
                System.err.println("Error: IOException occurred while reading " + fileName);
                e.printStackTrace();
            }
        }
    }
}