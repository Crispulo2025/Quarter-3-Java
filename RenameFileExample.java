import java.io.File;

public class RenameFileExample {
    public static void main(String[] args) {

        // Original file name
        File oldFile = new File("oldfile.txt");

        // New file name
        File newFile = new File("newfile.txt");

        // Attempt to rename
        if (oldFile.exists()) {
            boolean success = oldFile.renameTo(newFile);
            if (success) {
                System.out.println("File renamed successfully to: " + newFile.getName());
            } else {
                System.out.println("Failed to rename the file.");
            }
        } else {
            System.out.println("The file " + oldFile.getName() + " does not exist.");
        }
    }
}
