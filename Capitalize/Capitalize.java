// package Capitalize;

import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: java Capitalize <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            // Read each line from the input file, capitalize it, and write it to the output
            // file
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine(); // Write a new line after each line
            }
        }
    }

}
