import java.io.File;
import java.util.Scanner;

public class FilePermissionCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the full path of the file: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {

            if (file.canRead()) {
                System.out.println("The file is readable.");
            } else {
                System.out.println("The file is NOT readable.");
            }

            if (file.canWrite()) {
                System.out.println("The file is writable.");
            } else {
                System.out.println("The file is NOT writable.");
            }

        } else {
            System.out.println("File does not exist or is not a valid file.");
        }

        scanner.close();
    }
}
