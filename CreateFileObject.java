import java.io.File;

public class CreateFileObject {
    public static void main(String[] args) {

        // Create a File object for data/records.txt
        File file = new File("data/records.txt");

        System.out.println("File object created.");
        System.out.println("File path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
    }
}
