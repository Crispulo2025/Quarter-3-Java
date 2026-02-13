import java.io.File;

public class RenameFileExample {

    public static void main(String[] args) {

        // Create File objects
        File oldFile = new File("oldname.txt");
        File newFile = new File("newname.txt");

        // Check if old file exists
        if (!oldFile.exists()) {
            System.out.println("The file oldname.txt does not exist.");
            return;
        }

        // Rename the file
        boolean renamed = oldFile.renameTo(newFile);

        if (renamed) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}
