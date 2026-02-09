import java.util.Scanner;

public class CustomMessageExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 0) {
                // Throwing an exception with a custom message
                throw new IllegalArgumentException("Age cannot be negative. Please enter a valid age.");
            }

            System.out.println("Your age is: " + age);

        } catch (IllegalArgumentException e) {
            // Displaying the custom message
            System.out.println("Error: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}
