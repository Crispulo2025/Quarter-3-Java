import java.util.HashMap;
import java.util.Iterator;

public class PrintHashMapKeys {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<String, Double> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 1.2);
        map.put("Banana", 0.8);
        map.put("Orange", 1.5);
        map.put("Mango", 2.0);

        // Get the set of keys
        Iterator<String> iterator = map.keySet().iterator();

        // Iterate and print each key
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key);
        }
    }
}
