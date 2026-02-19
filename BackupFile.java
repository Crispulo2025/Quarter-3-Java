import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BackupFile {
    public static void main(String[] args) {
        String originalFile = "data.txt"; // replace with your file
        File file = new File(originalFile);

        if (!file.exists()) {
            System.out.println("Error: File '" + originalFile + "' does not exist.");
            return;
        }

        // Create timestamp in format yyyyMMdd_HHmmss
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Create backup file name
        String backupFileName = getBackupFileName(originalFile, timestamp);
        File backupFile = new File(backupFileName);

        try (FileInputStream fis = new FileInputStream(file);
             FileOutputStream fos = new FileOutputStream(backupFile)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("Backup created successfully: " + backupFileName);

        } catch (IOException e) {
            System.out.println("Error while backing up the file.");
            e.printStackTrace();
        }
    }

    // Method to insert timestamp before file extension
    private static String getBackupFileName(String originalFile, String timestamp) {
        int dotIndex = originalFile.lastIndexOf('.');
        if (dotIndex == -1) {
            // No extension
            return originalFile + "_" + timestamp;
        } else {
            String name = originalFile.substring(0, dotIndex);
            String extension = originalFile.substring(dotIndex);
            return name + "_" + timestamp + extension;
        }
    }
}
