import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        int vowelCount = 0;
        int consonantCount = 0;

        try {
            File file = new File("input.txt");  // Change filename if needed
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    if (ch >= 'a' && ch <= 'z') {  // Check if letter
                        if (ch == 'a' || ch == 'e' || ch == 'i' || 
                            ch == 'o' || ch == 'u') {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }
            }

            scanner.close();

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}