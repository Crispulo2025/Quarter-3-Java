import java.io.File;
import java.util.Scanner;

public class ListFilesAndDirectories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for directory path
        System.out.print("Enter the directory path: ");
        String path = scanner.nextLine();

        File directory = new File(path);

        // Check if directory exists and is valid
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path.");
            scanner.close();
            return;
        }

        // Get list of files and directories
        File[] contents = directory.listFiles();

        if (contents != null && contents.length > 0) {
            System.out.println("\nContents of the directory:");
            for (File item : contents) {
                if (item.isDirectory()) {
                    System.out.println("[DIR]  " + item.getName());
                } else if (item.isFile()) {
                    System.out.println("[FILE] " + item.getName());
                }
            }
        } else {
            System.out.println("The directory is empty.");
        }

        scanner.close();
    }
}
