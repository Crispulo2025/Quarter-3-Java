import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // File to read

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;

            System.out.println("Contents of \"" + inputFile + "\":\n");

            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line to console
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
