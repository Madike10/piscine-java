// package Capitalize;

import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: Capitalize <input_file> <output_file>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(capitalizeString(line));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }

}