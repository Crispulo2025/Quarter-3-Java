import java.util.*;

public class ContainsExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");

        boolean hasApple = fruits.contains("Apple");   // true
        boolean hasGrape = fruits.contains("Grape");   // false

        System.out.println("Contains Apple? " + hasApple);
        System.out.println("Contains Grape? " + hasGrape);
    }
}
