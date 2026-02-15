import java.io.File;
import java.util.Scanner;

public class CheckFileExists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String path = scanner.nextLine();

        File file = new File(path);

        if (file.exists()) {
            System.out.println("The file/path exists.");
        } else {
            System.out.println("The file/path does NOT exist.");
        }

        scanner.close();
    }
}
