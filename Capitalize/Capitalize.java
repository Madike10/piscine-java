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

        // Utilisation de try-with-resources pour gérer automatiquement la fermeture des
        // flux
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Capitalise la ligne en mettant toutes les lettres en majuscules
                String capitalizedLine = line.toUpperCase().trim();
                writer.write(capitalizedLine);
                writer.newLine(); // Ajoute une nouvelle ligne
            }
        } catch (FileNotFoundException e) {
            System.err.println("Fichier non trouvé : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture/écriture du fichier : " + e.getMessage());
        }
    }
}
