import java.util.LinkedHashSet;

public class DisplayLinkedHashSet {
    public static void main(String[] args) {
        // Create a LinkedHashSet with email addresses
        LinkedHashSet<String> emails = new LinkedHashSet<>();
        emails.add("alice@example.com");
        emails.add("bob@example.com");
        emails.add("charlie@example.com");
        emails.add("diana@example.com");
        emails.add("bob@example.com"); // Duplicate, will be ignored

        // Display all elements using for-each loop
        System.out.println("Email addresses in insertion order:");
        for (String email : emails) {
            System.out.println(email);
        }

        // Optional: Using forEach with lambda (Java 8+)
        System.out.println("\nUsing Java 8 forEach():");
        emails.forEach(System.out::println);
    }
}
