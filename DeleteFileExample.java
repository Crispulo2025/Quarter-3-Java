import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        String filename = "testfile.txt"; // File to delete

        File file = new File(filename);

        if (file.exists()) {
            boolean deleted = file.delete(); // Attempt to delete the file
            if (deleted) {
                System.out.println("File " + filename + " was deleted successfully.");
            } else {
                System.out.println("Failed to delete the file " + filename + ".");
            }
        } else {
            System.out.println("The file " + filename + " does not exist.");
        }
    }
}
