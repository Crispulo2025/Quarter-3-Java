import java.io.File;
import java.util.Scanner;

public class DeleteFileProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for file path
        System.out.print("Enter the full path of the file to delete: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        // Check if file exists
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }

        scanner.close();
    }
}
