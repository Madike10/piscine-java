// package Cat;

import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        for (String file : args) {
            try {
                File f = new File(file);
                if (!f.exists()) {
                    throw new FileNotFoundException("File '" + file + "' not found.");
                }

                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f))) {
                    int byteRead;
                    while ((byteRead = bis.read()) != -1) {
                        System.out.write(byteRead);
                    }
                }
            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}