import java.io.*;

public class FileSummaryReport {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count characters (excluding newline)
                charCount += line.length();

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            // Display summary report
            System.out.println("===== File Summary Report =====");
            System.out.println("Total Lines      : " + lineCount);
            System.out.println("Total Words      : " + wordCount);
            System.out.println("Total Characters : " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
