import java.io.File;
import java.util.Scanner;

public class FileOrDirectoryCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path: ");
        String path = scanner.nextLine();

        File file = new File(path);

        if (file.exists()) {

            if (file.isFile()) {
                System.out.println("The path refers to a FILE.");
            } else if (file.isDirectory()) {
                System.out.println("The path refers to a DIRECTORY.");
            }

        } else {
            System.out.println("The specified path does not exist.");
        }

        scanner.close();
    }
}
