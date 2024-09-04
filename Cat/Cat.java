package Cat;

import java.io.*;


public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length < 1) {
            return;
        }

        for (String fileName : args) {
            try (FileInputStream fis = new FileInputStream(fileName);
                 BufferedInputStream bis = new BufferedInputStream(fis)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = bis.read(buffer)) != -1) {
                    System.out.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + fileName);
            }
        }
    }
}
