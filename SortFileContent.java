import java.io.*;
import java.util.*;

public class SortFileContent {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        List<String> lines = new ArrayList<>();

        try {
            // Read file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Sort alphabetically
            Collections.sort(lines);

            // Write to output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            for (String sortedLine : lines) {
                writer.write(sortedLine);
                writer.newLine();
            }
            writer.close();

            System.out.println("File sorted successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
