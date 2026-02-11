import java.util.HashMap;
import java.util.Map;

public class MapMergeExample {

    // Method to merge two maps
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1); // Start with all entries from map1
        mergedMap.putAll(map2); // Add all entries from map2 (overwrites duplicates)
        return mergedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Alice", 85);
        map1.put("Bob", 90);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Charlie", 78);
        map2.put("Bob", 95); // Duplicate key, value will be overwritten

        Map<String, Integer> merged = mergeMaps(map1, map2);

        System.out.println(merged);
    }
}
