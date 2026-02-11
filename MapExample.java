import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                               ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Sample input (adding key-value pairs)
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 85);
        students.put("Bob", 92);
        students.put("Charlie", 78);

        // Calling the method
        printMap(students);
    }
}
