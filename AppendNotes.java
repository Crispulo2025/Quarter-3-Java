import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppendNotes {

    public static void main(String[] args) {
        String fileName = "notes.txt"; // file to append notes to
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your note (type 'exit' to finish):");

        try (FileWriter fw = new FileWriter(fileName, true); // 'true' enables append mode
             PrintWriter pw = new PrintWriter(fw)) {

            while (true) {
                String note = input.nextLine();

                if (note.equalsIgnoreCase("exit")) {
                    break;
                }

                pw.println(note); // append note to file
            }

            System.out.println("Notes successfully appended to " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        input.close();
    }
}