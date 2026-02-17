import java.io.*;
import java.util.Scanner;

public class MergeFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of files to merge: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        String[] inputFiles = new String[n];

        // Ask user for input file names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the path of file " + (i + 1) + ": ");
            inputFiles[i] = scanner.nextLine();
        }

        System.out.print("Enter the name of the output file: ");
        String outputFile = scanner.nextLine();

        mergeFiles(inputFiles, outputFile);
        System.out.println("Files merged successfully into " + outputFile);
    }

    public static void mergeFiles(String[] inputFiles, String outputFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String file : inputFiles) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine(); // preserve line breaks
                    }
                } catch (IOException e) {
                    System.out.println("Error reading file: " + file);
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + outputFile);
            e.printStackTrace();
        }
    }
}
