import java.io.File;
import java.util.Scanner;

public class AbsolutePathProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("Absolute path: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }

        scanner.close();
    }
}
