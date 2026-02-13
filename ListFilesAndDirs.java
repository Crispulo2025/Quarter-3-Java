import java.io.File;

public class ListFilesAndDirs {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Public\\Documents"; // Change to your folder path

        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            System.out.println("Listing contents of folder: " + folderPath);

            File[] filesList = folder.listFiles(); // Get all files and directories

            if (filesList != null && filesList.length > 0) {
                for (File file : filesList) {
                    if (file.isDirectory()) {
                        System.out.println("[DIR]  " + file.getName());
                    } else if (file.isFile()) {
                        System.out.println("[FILE] " + file.getName());
                    }
                }
            } else {
                System.out.println("The folder is empty.");
            }
        } else {
            System.out.println("The specified path does not exist or is not a directory.");
        }
    }
}
