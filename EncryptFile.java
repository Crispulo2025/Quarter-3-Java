import java.io.*;

public class EncryptFile {

    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "encrypted.txt";
        int shift = 3; // encryption key

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            while ((line = reader.readLine()) != null) {
                String encryptedLine = encrypt(line, shift);
                writer.write(encryptedLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("File encrypted successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                char encrypted = (char) ((ch + shift - 'A') % 26 + 'A');
                result.append(encrypted);

            } else if (Character.isLowerCase(ch)) {
                char encrypted = (char) ((ch + shift - 'a') % 26 + 'a');
                result.append(encrypted);

            } else {
                result.append(ch); // keep spaces, numbers, symbols
            }
        }

        return result.toString();
    }
}
