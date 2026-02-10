import java.util.HashSet;
import java.util.Set;

public class SetUnionExample {
    public static void main(String[] args) {
        // Create first set
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");

        // Create second set
        Set<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Grape");
        set2.add("Mango");

        // Create a new set for union
        Set<String> unionSet = new HashSet<>(set1); // start with all elements of set1
        unionSet.addAll(set2); // add all elements of set2

        System.out.println("Union of set1 and set2: " + unionSet);
    }
}
