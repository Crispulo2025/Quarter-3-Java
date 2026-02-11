import java.util.HashMap;
import java.util.Map;

public class RemoveKeyExample {
    public static void main(String[] args) {
        // Create a map and add entries
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 85);
        students.put("Bob", 90);
        students.put("Charlie", 78);

        // Remove the entry with key "Bob"
        students.remove("Bob");

        // Print the map after removal
        System.out.println(students);
    }
}
