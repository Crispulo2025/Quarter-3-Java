import java.io.File;
import java.util.Scanner;

public class GetFileName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the full path of the file: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
        } else {
            System.out.println("File does not exist.");
        }

        scanner.close();
    }
}
