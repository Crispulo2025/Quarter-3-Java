import java.io.*;

public class StreamDifferenceDemo {

    public static void main(String[] args) {

        // -------------------------------
        // 1. BYTE STREAM EXAMPLE
        // -------------------------------
        try {
            // Writing using FileOutputStream (Byte Stream)
            FileOutputStream byteOut = new FileOutputStream("byteFile.txt");
            String message = "Hello Byte Stream!";
            
            // Convert String to bytes
            byte[] byteData = message.getBytes();
            byteOut.write(byteData);
            byteOut.close();

            // Reading using FileInputStream (Byte Stream)
            FileInputStream byteIn = new FileInputStream("byteFile.txt");
            int data;
            System.out.print("Byte Stream Output: ");
            
            while ((data = byteIn.read()) != -1) {
                System.out.print((char) data);
            }
            byteIn.close();

        } catch (IOException e) {
            System.out.println("Byte Stream Error: " + e.getMessage());
        }

        System.out.println("\n");

        // -------------------------------
        // 2. CHARACTER STREAM EXAMPLE
        // -------------------------------
        try {
            // Writing using FileWriter (Character Stream)
            FileWriter charOut = new FileWriter("charFile.txt");
            charOut.write("Hello Character Stream!");
            charOut.close();

            // Reading using FileReader (Character Stream)
            FileReader charIn = new FileReader("charFile.txt");
            int data;
            System.out.print("Character Stream Output: ");

            while ((data = charIn.read()) != -1) {
                System.out.print((char) data);
            }
            charIn.close();

        } catch (IOException e) {
            System.out.println("Character Stream Error: " + e.getMessage());
        }
    }
}
