import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSummary {

    public static void main(String[] args) {

        String fileName = "sample.txt";  // Change this to your file name

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Count characters (excluding newline)
                charCount += line.length();

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("File Summary:");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}