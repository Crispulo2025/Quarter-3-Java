import java.io.*;

public class DecryptFile {
    public static void main(String[] args) {

        String inputFile = "encrypted.txt";
        int shift = 3; // same shift used during encryption

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = reader.readLine()) != null) {
                String decryptedLine = decrypt(line, shift);
                System.out.println(decryptedLine);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                char decrypted = (char) ((ch - shift - 'A' + 26) % 26 + 'A');
                result.append(decrypted);

            } else if (Character.isLowerCase(ch)) {
                char decrypted = (char) ((ch - shift - 'a' + 26) % 26 + 'a');
                result.append(decrypted);

            } else {
                result.append(ch); // keep spaces and symbols unchanged
            }
        }

        return result.toString();
    }
}
