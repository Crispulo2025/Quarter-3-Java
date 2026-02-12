import java.util.HashMap;
import java.util.Map;

public class DisplayHashMapEntries {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        map.put(4, "Diana");

        // Iterate using entrySet() to display both keys and values
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
