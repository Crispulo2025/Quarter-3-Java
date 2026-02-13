import java.io.File;
import java.util.Scanner;

public class CreateMultipleDirectories {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path to create: ");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);

        // mkdirs() creates parent directories if they do not exist
        if (directory.mkdirs()) {
            System.out.println("Directories created successfully.");
        } else {
            if (directory.exists()) {
                System.out.println("Directory already exists.");
            } else {
                System.out.println("Failed to create directories.");
            }
        }

        scanner.close();
    }
}
