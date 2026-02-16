import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // File to count words from
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as delimiter
                String[] words = line.trim().split("\\s+");
                // Check for empty lines
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            reader.close();
            System.out.println("The file \"" + inputFile + "\" has " + wordCount + " words.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
