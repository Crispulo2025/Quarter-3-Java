import java.io.File;
import java.util.Scanner;

public class ListDirectories {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the directory: ");
        String path = scanner.nextLine();

        File folder = new File(path);

        if (!folder.exists()) {
            System.out.println("The directory does not exist.");
        } else if (!folder.isDirectory()) {
            System.out.println("The path is not a directory.");
        } else {
            System.out.println("Directories inside " + path + ":");

            File[] files = folder.listFiles(); // list all files and directories

            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) { // check if it is a directory
                        System.out.println(f.getName());
                    }
                }
            }
        }

        scanner.close();
    }
}
