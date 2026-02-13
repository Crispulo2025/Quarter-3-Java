import java.io.File;
import java.util.Scanner;

public class PathChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String inputPath = scanner.nextLine();

        File file = new File(inputPath);

        if (file.isAbsolute()) {
            System.out.println("The path is ABSOLUTE.");
        } else {
            System.out.println("The path is RELATIVE.");
        }

        scanner.close();
    }
}
