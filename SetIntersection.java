import java.util.HashSet;
import java.util.Set;

public class SetIntersection {

    // Method to find intersection of two sets
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1); // start with all elements of set1
        result.retainAll(set2); // keep only elements also in set2
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);
        setB.add(4);

        Set<Integer> intersectionSet = intersection(setA, setB);
        System.out.println("Intersection: " + intersectionSet);
    }
}
