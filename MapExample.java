import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        
        scores.put("Alice", 90);  // Adds key "Alice" with value 90
        scores.put("Bob", 85);    // Adds key "Bob" with value 85
        
        // Add "Alice" again with a new value
        Integer oldValue = scores.put("Alice", 95);
        
        System.out.println("Old value of Alice: " + oldValue);  // Outputs: 90
        System.out.println("Updated scores: " + scores);       // Outputs: {Alice=95, Bob=85}
    }
}
