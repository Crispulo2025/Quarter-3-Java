import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String sourceFile = "source.txt";   // File to copy from
        String destinationFile = "copy.txt"; // File to copy to

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);      // Write each line
                writer.newLine();        // Preserve line breaks
            }

            reader.close();
            writer.close();

            System.out.println("Contents of \"" + sourceFile + "\" have been copied to \"" + destinationFile + "\" successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
