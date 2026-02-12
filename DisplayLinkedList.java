import java.util.LinkedList;
import java.util.Iterator;

public class DisplayLinkedList {
    public static void main(String[] args) {

        // Create a LinkedList of city names
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("New York");
        cities.add("London");
        cities.add("Sydney");

        // Create an iterator
        Iterator<String> iterator = cities.iterator();

        // Iterate and display each city
        System.out.println("Cities in the LinkedList:");
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);
        }
    }
}
