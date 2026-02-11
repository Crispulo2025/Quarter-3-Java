import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap of String keys and Integer values
        Map<String, Integer> studentScores = new HashMap<>();

        // Add at least five key-value pairs
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 88);
        studentScores.put("Eva", 92);

        // Print the map
        System.out.println("Student scores: " + studentScores);

        // Access a specific value using its key
        System.out.println("Charlie's score: " + studentScores.get("Charlie"));
    }
}
