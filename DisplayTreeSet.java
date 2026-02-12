import java.util.TreeSet;
import java.util.Iterator;

public class DisplayTreeSet {
    public static void main(String[] args) {

        // Create a TreeSet of course codes
        TreeSet<String> courses = new TreeSet<>();

        // Add elements
        courses.add("CHE101");
        courses.add("CSE102");
        courses.add("MAT103");
        courses.add("PHY104");

        // Get an iterator
        Iterator<String> iterator = courses.iterator();

        // Iterate and display each course code
        while (iterator.hasNext()) {
            String course = iterator.next();
            System.out.println(course);
        }
    }
}
