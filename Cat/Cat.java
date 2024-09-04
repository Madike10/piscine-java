package Cat;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Cat input_file");
            return;
        }
        String cat = args[0];
        Path path = Paths.get(cat);

        try{
            BufferedReader reader = Files.newBufferedReader(path);
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line.toString());
            }
            reader.close();
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
