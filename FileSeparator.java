import java.io.*;

public class FileSeparator {
    public static void main(String[] args) {
        String inputFile = "input.txt";        // original file
        String file1 = "matches.txt";          // lines that meet the condition
        String file2 = "non_matches.txt";      // lines that do not meet the condition
        String keyword = "Java";               // example condition

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    writer1.write(line);
                    writer1.newLine();
                } else {
                    writer2.write(line);
                    writer2.newLine();
                }
            }

            System.out.println("File separation complete.");
            System.out.println("Lines containing '" + keyword + "' -> " + file1);
            System.out.println("Other lines -> " + file2);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        } catch (IOException e) {
            System.out.println("Error reading or writing files.");
        }
    }
}
