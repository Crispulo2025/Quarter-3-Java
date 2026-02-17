import java.io.IOException;
import java.nio.file.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import static java.nio.file.StandardWatchEventKinds.*;

public class FileMonitor {

    public static void main(String[] args) throws IOException, InterruptedException {

        // File to monitor
        Path fileToWatch = Paths.get("sample.txt");
        Path directory = fileToWatch.getParent();

        if (directory == null) {
            directory = Paths.get(".");
        }

        WatchService watchService = FileSystems.getDefault().newWatchService();

        // Register directory for modification events
        directory.register(watchService, ENTRY_MODIFY);

        System.out.println("Monitoring file: " + fileToWatch.getFileName());

        while (true) {
            WatchKey key = watchService.take();

            for (WatchEvent<?> event : key.pollEvents()) {

                WatchEvent.Kind<?> kind = event.kind();

                Path changed = (Path) event.context();

                if (changed.endsWith(fileToWatch.getFileName())) {

                    System.out.println("File modified: " + changed);

                    // Log the change
                    try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
                        writer.println("File modified: " + changed + " at " + java.time.LocalDateTime.now());
                    }
                }
            }
            key.reset();
        }
    }
}
