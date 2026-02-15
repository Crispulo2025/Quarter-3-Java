import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFileCheck {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the path of the source file: ");
        String sourcePath = inputScanner.nextLine();

        File sourceFile = new File(sourcePath);

        // Check if source file exists
        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("Source file does not exist or is not a valid file.");
            inputScanner.close();
            return;
        }

        System.out.print("Enter the path for the destination file: ");
        String destPath = inputScanner.nextLine();
        File destFile = new File(destPath);

        try (Scanner fileScanner = new Scanner(sourceFile);
             PrintWriter writer = new PrintWriter(destFile)) {

            // Copy contents
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                writer.println(line);
            }

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error reading or writing file.");
            e.printStackTrace();
        }

        inputScanner.close();
    }
}
