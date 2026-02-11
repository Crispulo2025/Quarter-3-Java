import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortExample {
    public static void main(String[] args) {
        // Create a TreeMap (keys will be sorted automatically)
        TreeMap<String, Integer> scores = new TreeMap<>();

        // Adding entries
        scores.put("Charlie", 78);
        scores.put("Alice", 85);
        scores.put("Bob", 90);

        // Iterating over the TreeMap
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                               ", Value: " + entry.getValue());
        }
    }
}
