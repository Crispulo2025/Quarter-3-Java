import java.util.HashMap;
import java.util.Map;

public class PrintMapValuesGreaterThan50 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 45);
        scores.put("Bob", 75);
        scores.put("Charlie", 60);
        scores.put("Diana", 30);
        scores.put("Ethan", 90);

        // Iterating using entrySet()
        System.out.println("Entries with values greater than 50:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > 50) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        // Optional: Using Java 8 forEach() and lambda
        System.out.println("\nUsing Java 8 forEach():");
        scores.forEach((key, value) -> {
            if (value > 50) {
                System.out.println(key + " = " + value);
            }
        });
    }
}
