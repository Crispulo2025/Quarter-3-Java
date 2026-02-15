import java.io.File;
import java.io.IOException;

public class CompareFiles {

    public static void main(String[] args) throws IOException {

        // Create two File objects
        File file1 = new File("C:\\Users\\Public\\test.txt");
        File file2 = new File("C:\\Users\\Public\\test.txt");

        // Method 1: Compare canonical paths (RECOMMENDED)
        if (file1.getCanonicalPath().equals(file2.getCanonicalPath())) {
            System.out.println("Both File objects refer to the SAME file path.");
        } else {
            System.out.println("The File objects refer to DIFFERENT file paths.");
        }

        // Method 2: Using equals() (less reliable for relative paths)
        if (file1.equals(file2)) {
            System.out.println("Using equals(): Same path.");
        } else {
            System.out.println("Using equals(): Different path.");
        }
    }
}
