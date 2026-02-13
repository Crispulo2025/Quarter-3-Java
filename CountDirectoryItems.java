import java.io.File;
import java.util.Scanner;

public class CountDirectoryItems {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);

        // Check if path exists and is a directory
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        // Get list of files and folders
        File[] items = directory.listFiles();

        if (items != null) {
            System.out.println("Total number of items: " + items.length);
        } else {
            System.out.println("Unable to access the directory.");
        }

        scanner.close();
    }
}
