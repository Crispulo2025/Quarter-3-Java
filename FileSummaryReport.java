import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSummaryReport {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the path of the input file: ");
        String inputFilePath = inputScanner.nextLine();

        File inputFile = new File(inputFilePath);

        if (!inputFile.exists() || !inputFile.isFile()) {
            System.out.println("File does not exist.");
            inputScanner.close();
            return;
        }

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;

                String[] words = line.trim().split("\\s+"); // split by whitespace
                if (line.trim().isEmpty()) {
                    words = new String[0]; // handle empty lines
                }
                wordCount += words.length;

                charCount += line.length();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
            inputScanner.close();
            return;
        }

        // Create summary report file
        try (PrintWriter writer = new PrintWriter("summary_report.txt")) {
            writer.println("Summary Report for file: " + inputFile.getName());
            writer.println("Number of lines: " + lineCount);
            writer.println("Number of words: " + wordCount);
            writer.println("Number of characters: " + charCount);
            System.out.println("Summary report generated: summary_report.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error creating the summary report.");
            e.printStackTrace();
        }

        inputScanner.close();
    }
}
