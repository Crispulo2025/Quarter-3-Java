import java.io.*;

public class RemoveBlankLines {
    public static void main(String[] args) {
        String inputFile = "input.txt";   // original file
        String outputFile = "output.txt"; // cleaned file

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Check if the line is not blank (ignoring whitespace)
                if (!line.trim().isEmpty()) {
                    writer.write(line);
                    writer.newLine(); // write newline after each line
                }
            }

            System.out.println("Blank lines removed successfully. Cleaned file: " + outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        } catch (IOException e) {
            System.out.println("Error reading or writing files.");
        }
    }
}
