import java.io.File;
import java.util.Scanner;

public class FileSizeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the full path of the file: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            long fileSize = file.length();
            System.out.println("File size: " + fileSize + " bytes");
        } else {
            System.out.println("File does not exist or is not a valid file.");
        }

        scanner.close();
    }
}
