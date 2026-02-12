import java.util.HashMap;

public class PrintHashMapValues {
    public static void main(String[] args) {
        
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        
        // Add key-value pairs
        map.put("Alice", 85);
        map.put("Bob", 92);
        map.put("Charlie", 78);
        map.put("Diana", 90);
        
        // Print only the values using for-each loop
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}
