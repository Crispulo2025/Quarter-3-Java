import java.io.*;

public class ExtractCSVColumns {

    public static void main(String[] args) {

        String inputFile = "students.csv";
        String outputFile = "output.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            // Read header line
            line = br.readLine();
            if (line != null) {
                String[] headers = line.split(",");

                // Find index of specific columns
                int nameIndex = -1;
                int gradeIndex = -1;

                for (int i = 0; i < headers.length; i++) {
                    if (headers[i].equalsIgnoreCase("Name")) {
                        nameIndex = i;
                    }
                    if (headers[i].equalsIgnoreCase("Grade")) {
                        gradeIndex = i;
                    }
                }

                // Write new header
                bw.write("Name,Grade");
                bw.newLine();

                // Read remaining lines
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    if (nameIndex >= 0 && gradeIndex >= 0) {
                        bw.write(values[nameIndex] + "," + values[gradeIndex]);
                        bw.newLine();
                    }
                }
            }

            System.out.println("Columns extracted successfully!");

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
