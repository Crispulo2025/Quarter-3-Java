import java.util.Scanner;

public class ThrowsExample {

    // Method that declares it may throw an Exception
    public static void checkPositive(int number) throws Exception {
        if (number < 0) {
            throw new Exception("Negative numbers are not allowed!");
        }
        System.out.println("You entered a positive number: " + number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            // Call the method that may throw an exception
            checkPositive(num);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program execution finished.");
            sc.close();
        }
    }
}
