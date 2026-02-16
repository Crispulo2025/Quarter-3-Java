import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortFileContents {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the path of the source file: ");
        String sourcePath = inputScanner.nextLine();

        System.out.print("Enter the path of the destination file: ");
        String destPath = inputScanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("Source file does not exist or is not valid.");
            inputScanner.close();
            return;
        }

        List<String> lines = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(sourceFile)) {

            // Read all lines into a list
            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error reading the source file.");
            e.printStackTrace();
            inputScanner.close();
            return;
        }

        // Sort the lines alphabetically
        Collections.sort(lines);

        try (PrintWriter writer = new PrintWriter(destFile)) {

            // Write sorted lines to destination file
            for (String line : lines) {
                writer.println(line);
            }

            System.out.println("File sorted successfully and written to " + destFile.getAbsolutePath());

        } catch (FileNotFoundException e) {
            System.out.println("Error writing to the destination file.");
            e.printStackTrace();
        }

        inputScanner.close();
    }
}
