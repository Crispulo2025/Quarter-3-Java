import java.io.File;
import java.util.Scanner;

public class CountFilesInFolder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for folder path
        System.out.print("Enter the folder path: ");
        String folderPath = scanner.nextLine();

        File folder = new File(folderPath);

        // Check if folder exists and is a directory
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path.");
            scanner.close();
            return;
        }

        // Get all files and directories inside the folder
        File[] contents = folder.listFiles();
        int fileCount = 0;

        if (contents != null) {
            for (File f : contents) {
                if (f.isFile()) { // Count only files
                    fileCount++;
                }
            }
        }

        System.out.println("Number of files in folder: " + fileCount);
        scanner.close();
    }
}
