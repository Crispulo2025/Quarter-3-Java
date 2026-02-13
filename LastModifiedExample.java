import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class LastModifiedExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File does not exist.");
        } else {
            long lastModified = file.lastModified();
            Date date = new Date(lastModified);

            System.out.println("Last Modified Date and Time: " + date);
        }

        scanner.close();
    }
}
