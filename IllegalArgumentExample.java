import java.util.Scanner;

public class IllegalArgumentExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Manually throw an exception for invalid input
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative!");
            }

            System.out.println("Your age is: " + age);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program execution finished.");
            sc.close();
        }
    }
}
