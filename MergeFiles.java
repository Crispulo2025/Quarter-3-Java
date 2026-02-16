import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
        // Input file names
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        // Output file name
        String outputFile = "merged.txt";

        try {
            // Create BufferedReader for the first file
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            // Create BufferedReader for the second file
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            // Create BufferedWriter for the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            // Read from first file and write to output
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Read from second file and write to output
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Close all resources
            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Files have been merged into " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
