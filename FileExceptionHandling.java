import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExceptionHandling {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the path of the file to read: ");
        String filePath = inputScanner.nextLine();

        File file = new File(filePath);

        try {
            Scanner fileScanner = new Scanner(file);
            System.out.println("File contents:");

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file does not exist or cannot be opened.");
            // Optional: print stack trace for debugging
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            System.out.println("Program finished attempting to read the file.");
        }

        inputScanner.close();
    }
}
