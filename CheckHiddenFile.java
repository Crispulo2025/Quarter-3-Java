import java.io.File;
import java.util.Scanner;

public class CheckHiddenFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = scanner.nextLine();

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File does not exist.");
        } else if (file.isHidden()) {
            System.out.println("The file is hidden.");
        } else {
            System.out.println("The file is NOT hidden.");
        }

        scanner.close();
    }
}
