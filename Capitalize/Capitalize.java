// package Capitalize;

import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: java Capitalize <input_file> <output_file>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        String line;
        while ((line = reader.readLine())!= null) {
            String capitalizedLine = (line.toUpperCase().trim());
            writer.write(capitalizedLine);
            writer.newLine();
        }

        reader.close();
        writer.close();

    }
        
}
