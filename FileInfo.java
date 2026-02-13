import java.io.File;

public class FileInfo {

    public static void main(String[] args) {
        // File to check
        String fileName = "sample.txt";
        File file = new File(fileName);

        // Check if file exists
        if (file.exists()) {
            System.out.println("File '" + fileName + "' exists.");
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File '" + fileName + "' does not exist.");
        }
    }
}
